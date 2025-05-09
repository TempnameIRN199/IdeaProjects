package org.example.sportshop.repository;

import org.example.sportshop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query("SELECT p FROM Product p WHERE " +
            "(:name IS NULL OR p.name LIKE %:name%) AND " +
            "(:brand IS NULL OR p.brand LIKE %:brand%) AND " +
            "(:minPrice IS NULL OR p.price >= :minPrice) AND " +
            "(:maxPrice IS NULL OR p.price <= :maxPrice) AND " +
            "(:categoryId IS NULL OR p.category.id = :categoryId) AND " +
            "(:size IS NULL OR p.size LIKE %:size%) AND " +
            "(:color IS NULL OR p.color LIKE %:color%)")
    List<Product> searchProducts(@Param("name") String name,
                                 @Param("brand") String brand,
                                 @Param("minPrice") BigDecimal minPrice,
                                 @Param("maxPrice") BigDecimal maxPrice,
                                 @Param("categoryId") Integer categoryId,
                                 @Param("size") String size,
                                 @Param("color") String color);
    List<Product> findAll();

    List<Product> findByBrand(String brand);

    List<Product> findBySize(String size);

    List<Product> findByPriceBetween(BigDecimal minPrice, BigDecimal maxPrice);

    List<Product> findByBrandAndPriceBetween(String brand, BigDecimal minPrice, BigDecimal maxPrice);

    List<Product> findByBrandAndPriceBetweenAndSize(String brand, BigDecimal minPrice, BigDecimal maxPrice, String size);

    List<Product> findByCategoryId(Integer categoryId);

    List<Product> findByBrandAndCategoryId(String brand, Integer categoryId);

    List<Product> findByPriceBetweenAndCategoryId(BigDecimal minPrice, BigDecimal maxPrice, Integer categoryId);

    List<Product> findBySizeAndCategoryId(String size, Integer categoryId);

    List<Product> findByBrandAndPriceBetweenAndSizeAndCategoryId(String brand, BigDecimal minPrice, BigDecimal maxPrice, String size, Integer categoryId);
    @Query("select distinct p.brand from Product p where p.brand is not null")
    List<String> findAllDistinctBrands();

    @Query("select distinct p.size from Product p where p.size is not null")
    List<String> findAllDistinctSizes();

    @Query("select distinct p.color from Product p where p.color is not null")
    List<String> findAllDistinctColors();

    @Query("SELECT DISTINCT p.brand FROM Product p WHERE p.category.id = :categoryId")
    List<String> findDistinctBrandsByCategoryId(@Param("categoryId") Integer categoryId);

    @Query("SELECT DISTINCT p.size FROM Product p WHERE p.category.id = :categoryId")
    List<String> findDistinctSizesByCategoryId(@Param("categoryId") Integer categoryId);

    @Query("select distinct p.color from Product p where p.category.id = :categoryId")
    List<String> findDistinctColorsByCategoryId(@Param("categoryId") Integer categoryId);

    @Query("SELECT p.quantity FROM Product p WHERE p.id = :productId")
    Integer findQuantityByProductId(@Param("productId") Integer productId);
}

