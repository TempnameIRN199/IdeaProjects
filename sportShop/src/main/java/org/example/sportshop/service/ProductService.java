package org.example.sportshop.service;

import org.example.sportshop.entity.Product;
import org.example.sportshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Integer getQuantityCount(Integer productId) {
        return productRepository.findQuantityByProductId(productId);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    public List<Product> getProductsByBrand(String brand) {
        return productRepository.findByBrand(brand);
    }
    public List<Product> getProductsBySize(String size) {
        return productRepository.findBySize(size);
    }
    public List<Product> getProductsByPriceRange(BigDecimal minPrice, BigDecimal maxPrice) {
        return productRepository.findByPriceBetween(minPrice, maxPrice);
    }
    public List<String> getAllBrands() {
        return productRepository.findAllDistinctBrands();
    }
    public List<String> getAllSizes() {
        return productRepository.findAllDistinctSizes();
    }

    public List<Product> getProductsByCategoryId(Integer categoryId) {
        return productRepository.findByCategoryId(categoryId);
    }

    public List<Product> getProductsByBrandAndCategory(String brand, Integer categoryId) {
        return productRepository.findByBrandAndCategoryId(brand, categoryId);
    }

    public List<Product> getProductsByPriceRangeAndCategory(BigDecimal minPrice, BigDecimal maxPrice, Integer categoryId) {
        return productRepository.findByPriceBetweenAndCategoryId(minPrice, maxPrice, categoryId);
    }

    public List<Product> getProductsBySizeAndCategory(String size, Integer categoryId) {
        return productRepository.findBySizeAndCategoryId(size, categoryId);
    }

    public List<Product> getProductByBrandAndPriceBetweenAndSizeAndCategory(String brand, BigDecimal minPrice, BigDecimal maxPrice, String size, Integer categoryId) {
        return productRepository.findByBrandAndPriceBetweenAndSizeAndCategoryId(brand, minPrice, maxPrice, size, categoryId);
    }

    public Product getProductById(Integer id) {
        return productRepository.findById(id).orElse(null);
    }

    public List<Product> searchProducts(String name, String brand, BigDecimal minPrice, BigDecimal maxPrice,
                                        Integer categoryId, String size, String color) {
        return productRepository.searchProducts(name, brand, minPrice, maxPrice, categoryId, size, color);
    }

    public List<String> getBrandsByCategory(Integer categoryId) {
        return productRepository.findDistinctBrandsByCategoryId(categoryId);
    }

    public List<String> getSizesByCategory(Integer categoryId) {
        return productRepository.findDistinctSizesByCategoryId(categoryId);
    }

    public List<String> getAllDistinctColors (String color) {
        return productRepository.findAllDistinctColors();
    }

    public List<String> getColorByCategory(Integer categoryId) {
        return productRepository.findDistinctColorsByCategoryId(categoryId);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }
}

