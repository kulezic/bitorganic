package com.ak.bitorganic.dto.organicstatus;

import com.ak.bitorganic.domain.Group;
import com.ak.bitorganic.dto.group.GroupDto;
import com.ak.bitorganic.enums.OrganicStatusEnum;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import java.util.Date;

public class OrganicStatusDto {
    private Long organicStatusId;

    private String organicStatusEnum;
    private Date awardedDate;

    private GroupDto groupDto;

    public OrganicStatusDto() {
    }

    public OrganicStatusDto(Long organicStatusId,
                            String organicStatusEnum,
                            Date awardedDate,
                            GroupDto groupDto) {
        this.organicStatusId = organicStatusId;
        this.organicStatusEnum = organicStatusEnum;
        this.awardedDate = awardedDate;
        this.groupDto = groupDto;
    }

    public Long getOrganicStatusId() {
        return organicStatusId;
    }

    public void setOrganicStatusId(Long organicStatusId) {
        this.organicStatusId = organicStatusId;
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

    public GroupDto getGroupDto() {
        return groupDto;
    }

    public void setGroupDto(GroupDto groupDto) {
        this.groupDto = groupDto;
    }
}
