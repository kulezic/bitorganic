package com.ak.bitorganic.service;

import com.ak.bitorganic.domain.Group;
import com.ak.bitorganic.dto.group.GroupCreateDto;
import com.ak.bitorganic.dto.group.GroupDto;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface GroupService {

    boolean saveGroup(GroupCreateDto groupCreateDto);
    boolean updateGroup(GroupCreateDto groupCreateDto);
    boolean deleteGroup(Long groupId);

    GroupDto findByGroupId(Long groupId);

    List<GroupDto> findAllGroups();
    List<GroupDto> searchGroups(Specification<Group> specification);

}
