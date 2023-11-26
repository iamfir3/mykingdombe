package com.mykingdom.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BrandEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String comeFrom;
    private String logo;

    @OneToMany
    private List<ProductEntity> products;

    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private CategoryEntity category;

}