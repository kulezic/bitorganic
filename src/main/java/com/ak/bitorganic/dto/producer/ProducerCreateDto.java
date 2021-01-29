package com.ak.bitorganic.dto.producer;

public class ProducerCreateDto {

    private Long producerNumber;
    private String name;
    private String surname;
    private Long BPG;

    private Long groupId;

    public ProducerCreateDto() {
    }

    public ProducerCreateDto(Long producerNumber,
                             String name,
                             String surname,
                             Long BPG,
                             Long groupId,
                             String organicStatus) {
        this.producerNumber = producerNumber;
        this.name = name;
        this.surname = surname;
        this.BPG = BPG;
        this.groupId = groupId;
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

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }
}
