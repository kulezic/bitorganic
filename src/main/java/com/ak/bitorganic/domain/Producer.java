package com.ak.bitorganic.domain;

import com.ak.bitorganic.enums.OrganicStatusEnum;

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

    @OneToOne
    private ProducerStatus producerStatus;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "producer", orphanRemoval = true)
    private List<FieldStructure> fieldStructures;


    public Producer() {
    }

    public Producer(Long producerId,
                    Long producerNumber,
                    String name,
                    String surname,
                    Long BPG,
                    Group group,
                    ProducerStatus producerStatus,
                    List<FieldStructure> fieldStructures) {
        this.producerId = producerId;
        this.producerNumber = producerNumber;
        this.name = name;
        this.surname = surname;
        this.BPG = BPG;
        this.group = group;
        this.producerStatus = producerStatus;
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

    public List<FieldStructure> getFieldStructures() {
        return fieldStructures;
    }

    public void setFieldStructures(List<FieldStructure> fieldStructures) {
        this.fieldStructures = fieldStructures;
    }

    public void addFieldStructure(FieldStructure fieldStructure){
        this.fieldStructures.add(fieldStructure);
    }

    public ProducerStatus getProducerStatus() {
        return producerStatus;
    }

    public void setProducerStatus(ProducerStatus producerStatus) {
        this.producerStatus = producerStatus;
    }
}
