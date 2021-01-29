package com.ak.bitorganic.domain;

import com.ak.bitorganic.enums.OrganicStatusEnum;

import javax.persistence.*;
import java.util.Date;

@Entity
public class OrganicStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long organicStatusId;

    @Enumerated(EnumType.STRING)
    private OrganicStatusEnum organicStatusEnum;
    private Date awardedDate;

    @OneToOne
    private Group group;

    public OrganicStatus() {
    }

    public Long getOrganicStatusId() {
        return organicStatusId;
    }

    public void setOrganicStatusId(Long organicStatusId) {
        this.organicStatusId = organicStatusId;
    }

    public OrganicStatusEnum getOrganicStatusEnum() {
        return organicStatusEnum;
    }

    public void setOrganicStatusEnum(OrganicStatusEnum organicStatusEnum) {
        this.organicStatusEnum = organicStatusEnum;
    }

    public Date getAwardedDate() {
        return awardedDate;
    }

    public void setAwardedDate(Date awardedDate) {
        this.awardedDate = awardedDate;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
