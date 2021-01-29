package com.ak.bitorganic.repository;


import com.ak.bitorganic.domain.FieldStructure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@RepositoryRestResource
public interface FieldStructureRepository extends JpaRepository<FieldStructure, Long> , JpaSpecificationExecutor<FieldStructure> {

    Optional<FieldStructure> findByFiledStructureId(Long fieldStructureId);

    @Transactional
    Long deleteByFiledStructureId(Long fieldStructureId);

}
