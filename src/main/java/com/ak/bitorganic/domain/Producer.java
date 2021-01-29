package com.ak.bitorganic.domain;

import com.ak.bitorganic.enums.OrganicStatus;

import javax.persistence.*;
import java.util.List;

@Entity
public class Producer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long producerId;

    private Long producerNumber;
    private String name;
    private String surname;
    private Long BPG;

    @ManyToOne
    private Group group;

    @Enumerated(EnumType.STRING)
    private OrganicStatus organicStatus;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "producer", orphanRemoval = true)
    private List<FieldStructure> fieldStructures;


    public Producer() {
    }

    public Producer(String name,
                    String surname,
                    Long BPG,
                    List<FieldStructure> fieldStructures) {
        this.name = name;
        this.surname = surname;
        this.BPG = BPG;
        this.fieldStructures = fieldStructures;
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

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public OrganicStatus getOrganicStatus() {
        return organicStatus;
    }

    public void setOrganicStatus(OrganicStatus organicStatus) {
        this.organicStatus = organicStatus;
    }

    public List<FieldStructure> getFieldStructures() {
        return fieldStructures;
    }

    public void setFieldStructures(List<FieldStructure> fieldStructures) {
        this.fieldStructures = fieldStructures;
    }

    public void addFieldStructure(FieldStructure fieldStructure){
        this.fieldStructures.add(fieldStructure);
    }
}
