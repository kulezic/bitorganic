package com.ak.bitorganic.repository;

import com.ak.bitorganic.domain.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@RepositoryRestResource
public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long> , JpaSpecificationExecutor<PurchaseOrder> {

    Optional<PurchaseOrder> findByInputOrderId(Long inputOrderId);

    @Transactional
    Long deleteByInputOrderId(Long inputOrderId);

}
