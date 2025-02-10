package com.practice.shppingmall.model;

import com.practice.shppingmall.enums.SizeType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String category;
    private String subCategory;
    private String consumerType;
    private String title;
    private Integer price;
    private Integer stock;
    private String description;

    @Enumerated(EnumType.STRING)
    private SizeType size; // 클래스 바꿈

    private String color;
    private String thumbnailImagePath;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
