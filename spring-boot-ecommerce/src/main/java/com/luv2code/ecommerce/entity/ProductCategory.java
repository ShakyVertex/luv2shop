package com.luv2code.ecommerce.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

// Lombok框架在处理一对多和多对多有bug，所以此处使用Getter和Setter注解

@Entity
@Table(name = "product_category")
@Getter
@Setter
public class ProductCategory {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "category_name")
    private String categoryName;

    // CascadeType.ALL支持所有的级联操作
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Product> products;
}
