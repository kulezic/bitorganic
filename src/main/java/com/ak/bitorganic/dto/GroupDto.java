package com.ak.bitorganic.dto;



import java.util.List;

public class GroupDto {

    private Long groupId;

    private Long groupNumber;
    private String companyName;
    private Long PIB;

    private List<ProducerDto> producerDtoList;
    private String organicStatus;

    public GroupDto() {
    }

    public GroupDto(Long groupId,
                    Long groupNumber,
                    String companyName,
                    Long PIB,
                    List<ProducerDto> producerDtoList,
                    String organicStatus) {
        this.groupId = groupId;
        this.groupNumber = groupNumber;
        this.companyName = companyName;
        this.PIB = PIB;
        this.producerDtoList = producerDtoList;
        this.organicStatus = organicStatus;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(Long groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Long getPIB() {
        return PIB;
    }

    public void setPIB(Long PIB) {
        this.PIB = PIB;
    }

    public List<ProducerDto> getProducerDtoList() {
        return producerDtoList;
    }

    public void setProducerDtoList(List<ProducerDto> producers) {
        this.producerDtoList = producers;
    }

    public String getOrganicStatus() {
        return organicStatus;
    }

    public void setOrganicStatus(String organicStatus) {
        this.organicStatus = organicStatus;
    }
}
