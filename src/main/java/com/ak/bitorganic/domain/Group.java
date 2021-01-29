package com.ak.bitorganic.domain;

import com.ak.bitorganic.enums.OrganicStatus;

import javax.persistence.*;
import java.util.List;

@Entity
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long groupId;

    private Long groupNumber;
    private String companyName;
    private Long PIB;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "group", orphanRemoval = true)
    private List<Producer> producers;

    @Enumerated(EnumType.STRING)
    private OrganicStatus organicStatus;

    public Group() {
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

    public List<Producer> getProducers() {
        return producers;
    }

    public void setProducers(List<Producer> producers) {
        this.producers = producers;
    }

    public OrganicStatus getOrganicStatus() {
        return organicStatus;
    }

    public void setOrganicStatus(OrganicStatus organicStatus) {
        this.organicStatus = organicStatus;
    }
}
