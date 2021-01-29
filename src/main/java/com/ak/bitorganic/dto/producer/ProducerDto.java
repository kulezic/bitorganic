package com.ak.bitorganic.dto.producer;

import com.ak.bitorganic.dto.fieldstructure.FieldStructureDto;
import com.ak.bitorganic.dto.group.GroupDto;

import java.util.List;

public class ProducerDto {

    private Long producerId;
    private Long producerNumber;
    private String name;
    private String surname;
    private Long BPG;

    private GroupDto groupDto;

    private List<FieldStructureDto> currFieldStructureDtoList;
    private List<FieldStructureDto> pastFieldStructureDtoList;

    public ProducerDto() {
    }

    public ProducerDto(Long producerId,
                       Long producerNumber,
                       String name,
                       String surname,
                       Long BPG,
                       GroupDto groupDto,
                       List<FieldStructureDto> currFieldStructureDtoList,
                       List<FieldStructureDto> pastFieldStructureDtoList) {
        this.producerId = producerId;
        this.producerNumber = producerNumber;
        this.name = name;
        this.surname = surname;
        this.BPG = BPG;
        this.groupDto = groupDto;
        this.currFieldStructureDtoList = currFieldStructureDtoList;
        this.pastFieldStructureDtoList = pastFieldStructureDtoList;
    }

    public Long getProducerId() {
        return producerId;
    }

    public void setProducerId(Long producerId) {
        this.producerId = producerId;
    }

    public Long getProducerNumber() {
        return producerNumber;
    }

    public void setProducerNumber(Long producerNumber) {
        this.producerNumber = producerNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Long getBPG() {
        return BPG;
    }

    public void setBPG(Long BPG) {
        this.BPG = BPG;
    }

    public GroupDto getGroupDto() {
        return groupDto;
    }

    public void setGroupDto(GroupDto groupDto) {
        this.groupDto = groupDto;
    }

    public List<FieldStructureDto> getCurrFieldStructureDtoList() {
        return currFieldStructureDtoList;
    }

    public void setCurrFieldStructureDtoList(List<FieldStructureDto> currFieldStructureDtoList) {
        this.currFieldStructureDtoList = currFieldStructureDtoList;
    }

    public List<FieldStructureDto> getPastFieldStructureDtoList() {
        return pastFieldStructureDtoList;
    }

    public void setPastFieldStructureDtoList(List<FieldStructureDto> pastFieldStructureDtoList) {
        this.pastFieldStructureDtoList = pastFieldStructureDtoList;
    }
}
