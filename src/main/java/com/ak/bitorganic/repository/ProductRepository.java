package com.ak.bitorganic.repository;

import com.ak.bitorganic.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> , JpaSpecificationExecutor<Product> {

    Optional<Product> findByProductId(Long productId);

    Optional<Product> findByProductDesignation(String productDesignation);

    @Transactional
    Long deleteByProductId(Long productId);
}
