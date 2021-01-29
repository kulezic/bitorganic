package com.ak.bitorganic.repository;

import com.ak.bitorganic.domain.ProductionOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@RepositoryRestResource
public interface ProductionOrderRepository extends JpaRepository<ProductionOrder, Long> , JpaSpecificationExecutor<ProductionOrder> {

    Optional<ProductionOrder> findByProductionOrderId(Long productionOrderId);

    @Transactional
    Long deleteByProductionOrderId(Long productionOrderId);
}
