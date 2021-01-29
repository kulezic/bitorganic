package com.ak.bitorganic.repository;

import com.ak.bitorganic.domain.Batch;
import com.ak.bitorganic.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
@RepositoryRestResource
public interface BatchRepository extends JpaRepository<Batch, Long> , JpaSpecificationExecutor<Batch> {

    Optional<Batch> findByBatchId(Long batchId);

    Optional<Batch> findByBatchNumberAndCreatedDateAndProduct(Long batchNumber, Date createdDate, Product product);

    Optional<List<Batch>> findAllByBatchId(List<Long> ids);

    @Transactional
    Long deleteByBatchId(Long batchId);
}
