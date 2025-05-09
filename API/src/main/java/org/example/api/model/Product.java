package org.example.api.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private BigDecimal price;
    private String size;
    private String color;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    private String image;
    private int stock;
    private String created_at;
}

