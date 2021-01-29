package com.ak.bitorganic.dto.organicstatus;

import com.ak.bitorganic.dto.group.GroupDto;

import java.util.Date;

public class OrganicStatusCreateDto {
    private String organicStatusEnum;
    private Date awardedDate;

    private Long groupId;

    public OrganicStatusCreateDto() {
    }

    public OrganicStatusCreateDto(String organicStatusEnum, Date awardedDate, Long groupId) {
        this.organicStatusEnum = organicStatusEnum;
        this.awardedDate = awardedDate;
        this.groupId = groupId;
    }

    public String getOrganicStatusEnum() {
        return organicStatusEnum;
    }

    public void setOrganicStatusEnum(String organicStatusEnum) {
        this.organicStatusEnum = organicStatusEnum;
    }

    public Date getAwardedDate() {
        return awardedDate;
    }

    public void setAwardedDate(Date awardedDate) {
        this.awardedDate = awardedDate;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }
}
