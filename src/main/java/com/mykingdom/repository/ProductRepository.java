package com.mykingdom.repository;

import com.mykingdom.entity.BrandEntity;
import com.mykingdom.entity.CategoryEntity;
import com.mykingdom.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Long> {
    ProductEntity findByName(String name);

    List<ProductEntity> findAllByCategory(CategoryEntity categoryEntity);

    List<ProductEntity> findAllByBrand(BrandEntity brandEntity);
}
