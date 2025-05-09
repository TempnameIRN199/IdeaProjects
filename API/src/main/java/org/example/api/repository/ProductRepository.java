package org.example.api.repository;

import org.example.api.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    // Отримання товарів за категорією з пагінацією
    Page<Product> findByCategoryId(Long categoryId, Pageable pageable);

    // Пошук товарів за назвою (часткове співпадіння, ігноруючи регістр)
    Page<Product> findByNameContainingIgnoreCase(String name, Pageable pageable);

    // Оновлення запасів (зменшення кількості після замовлення)
    @Modifying
    @Query("UPDATE Product p SET p.stock = p.stock - :quantity WHERE p.id = :id AND p.stock >= :quantity")
    int reduceStock(@Param("id") Long id, @Param("quantity") Integer quantity);
}