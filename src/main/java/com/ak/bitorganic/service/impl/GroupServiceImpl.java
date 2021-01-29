package com.ak.bitorganic.service.impl;

import com.ak.bitorganic.domain.FieldStructure;
import com.ak.bitorganic.domain.Group;
import com.ak.bitorganic.dto.GroupCreateDto;
import com.ak.bitorganic.dto.GroupDto;
import com.ak.bitorganic.exception.NotFoundException;
import com.ak.bitorganic.mapper.GroupMapper;
import com.ak.bitorganic.mapper.ProductMapper;
import com.ak.bitorganic.repository.GroupRepository;
import com.ak.bitorganic.repository.ProducerRepository;
import com.ak.bitorganic.service.GroupService;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GroupServiceImpl implements GroupService {

    private GroupRepository groupRepository;
    private ProducerRepository producerRepository;

    private GroupMapper groupMapper;

    public GroupServiceImpl(GroupRepository groupRepository,
                            ProducerRepository producerRepository,
                            GroupMapper groupMapper) {
        this.groupRepository = groupRepository;
        this.producerRepository = producerRepository;
        this.groupMapper = groupMapper;
    }

    @Override
    public boolean saveGroup(GroupCreateDto groupCreateDto) {
        return false;
    }

    @Override
    public boolean updateGroup(GroupCreateDto groupCreateDto) {
        return false;
    }

    @Override
    public boolean deleteGroup(Long groupId) {
        Long deletedGroup = groupRepository.deleteByGroupId(groupId);
        if (deletedGroup == 0) return false;
        return true;
    }

    @Override
    public GroupDto findByGroupId(Long groupId) {
        Group group = groupRepository.findByGroupId(groupId)
                .orElseThrow(() -> new NotFoundException(String.format("Group with id: %d not found.", groupId)));
        return groupMapper.groupToGroupDto(group);
    }

    @Override
    public List<GroupDto> findAllGroups() {
        return groupRepository.findAll().stream().map(groupMapper::groupToGroupDto).collect(Collectors.toList());
    }

    @Override
    public List<GroupDto> searchGroups(Specification<Group> specification) {
        return groupRepository.findAll(Specification.where(specification)).stream()
                .map(groupMapper::groupToGroupDto).collect(Collectors.toList());
    }
}
