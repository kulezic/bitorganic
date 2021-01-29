package com.ak.bitorganic.mapper;

import com.ak.bitorganic.domain.Group;
import com.ak.bitorganic.dto.group.GroupDto;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class GroupMapper {
    private ProducerMapper producerMapper;

    public GroupMapper(ProducerMapper producerMapper) {
        this.producerMapper = producerMapper;
    }

    public GroupDto groupToGroupDto(Group group){
        GroupDto groupDto = new GroupDto();
        groupDto.setGroupId(group.getGroupId());
        groupDto.setGroupNumber(group.getGroupNumber());
        groupDto.setCompanyName(group.getCompanyName());
        groupDto.setPIB(group.getPIB());
        groupDto.setProducerDtoList(group.getProducers().stream()
                .map(producerMapper::producerToProducerDto).collect(Collectors.toList()));
        return groupDto;
    }
}
