package com.ak.bitorganic.dto;

public class GroupCreateDto {

    private Long groupNumber;
    private String companyName;
    private Long PIB;

    public GroupCreateDto() {
    }

    public GroupCreateDto(Long groupNumber, String companyName, Long PIB) {
        this.groupNumber = groupNumber;
        this.companyName = companyName;
        this.PIB = PIB;
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
}
