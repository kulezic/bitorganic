package com.ak.bitorganic.dto;

import java.util.List;

public class ProducerDto {

    private Long producerId;
    private Long producerNumber;
    private String name;
    private String surname;
    private Long BPG;

    private Long groupNumber;
    private String organicStatus;

    private List<FieldStructureDto> fieldStructureDtoList;

    public ProducerDto() {
    }

    public ProducerDto(Long producerId,
                       Long producerNumber,
                       String name,
                       String surname,
                       Long BPG,
                       Long groupNumber,
                       String organicStatus,
                       List<FieldStructureDto> fieldStructureDtoList) {
        this.producerId = producerId;
        this.producerNumber = producerNumber;
        this.name = name;
        this.surname = surname;
        this.BPG = BPG;
        this.groupNumber = groupNumber;
        this.organicStatus = organicStatus;
        this.fieldStructureDtoList = fieldStructureDtoList;
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

    public Long getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(Long groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getOrganicStatus() {
        return organicStatus;
    }

    public void setOrganicStatus(String organicStatus) {
        this.organicStatus = organicStatus;
    }

    public List<FieldStructureDto> getFieldStructureDtoList() {
        return fieldStructureDtoList;
    }

    public void setFieldStructureDtoList(List<FieldStructureDto> fieldStructureDtoList) {
        this.fieldStructureDtoList = fieldStructureDtoList;
    }
}
