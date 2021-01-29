package com.ak.bitorganic.repository;

import com.ak.bitorganic.domain.Producer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@RepositoryRestResource
public interface ProducerRepository extends JpaRepository<Producer, Long> , JpaSpecificationExecutor<Producer> {

    Optional<Producer> findByProducerId(Long producerId);

    @Transactional
    Long deleteByProducerId(Long producerId);
}
