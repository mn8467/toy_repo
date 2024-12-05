package com.practice.shppingmall.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "arrivals")
public class Arrival {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column
    private float price;

    @Column(name = "thumbnail_img_path")
    private String thumbNailImgPath;

    @Column(name = "thumbnail_img_name")
    private String thumbNailImgName;

    @Column(name = "new_yn")
    private String newYn;

    @Column(name = "sale_yn")
    private String saleYn;
}
