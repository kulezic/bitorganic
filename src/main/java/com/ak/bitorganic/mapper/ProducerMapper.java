package com.ak.bitorganic.mapper;

import com.ak.bitorganic.domain.Producer;
import com.ak.bitorganic.dto.producer.ProducerDto;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class ProducerMapper {
    private FieldStructureMapper fieldStructureMapper;

    public ProducerMapper(FieldStructureMapper fieldStructureMapper) {
        this.fieldStructureMapper = fieldStructureMapper;
    }

    public ProducerDto producerToProducerDto(Producer producer){
        ProducerDto producerDto = new ProducerDto();
        producerDto.setProducerId(producer.getProducerId());
        producerDto.setProducerNumber(producer.getProducerNumber());
        producerDto.setName(producer.getName());
        producerDto.setSurname(producer.getSurname());
        producerDto.setBPG(producer.getBPG());
        producerDto.setGroupNumber(producer.getGroup().getGroupNumber());
        producerDto.setOrganicStatus(producer.getOrganicStatus().toString());
        producerDto.setCurrFieldStructureDtoList(producer.getFieldStructures().stream()
                .map(fieldStructureMapper::fieldStructureToFieldStructureDto).collect(Collectors.toList()));
        return producerDto;
    }
}
