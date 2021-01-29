package com.ak.bitorganic.repository;

import com.ak.bitorganic.domain.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@RepositoryRestResource
public interface GroupRepository extends JpaRepository<Group, Long> , JpaSpecificationExecutor<Group> {

    Optional<Group> findByGroupId(Long groupId);

    @Transactional
    Long deleteByGroupId(Long groupId);
}
