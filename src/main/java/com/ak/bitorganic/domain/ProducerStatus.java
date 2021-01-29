package com.ak.bitorganic.domain;

import com.ak.bitorganic.enums.ProducerStatusEnum;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ProducerStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long producerStatusId;

    @Enumerated
    private ProducerStatusEnum producerStatusEnum;

    private Date startCooperationDate;
    private Date endCooperationDate;

    @OneToOne
    private Producer producer;

    public ProducerStatus() {
    }

    public ProducerStatus(Long producerStatusId,
                          ProducerStatusEnum producerStatusEnum,
                          Date startCooperationDate,
                          Date endCooperationDate,
                          Producer producer) {
        this.producerStatusId = producerStatusId;
        this.producerStatusEnum = producerStatusEnum;
        this.startCooperationDate = startCooperationDate;
        this.endCooperationDate = endCooperationDate;
        this.producer = producer;
    }

    public Long getProducerStatusId() {
        return producerStatusId;
    }

    public void setProducerStatusId(Long producerStatusId) {
        this.producerStatusId = producerStatusId;
    }

    public ProducerStatusEnum getProducerStatusEnum() {
        return producerStatusEnum;
    }

    public void setProducerStatusEnum(ProducerStatusEnum producerStatusEnum) {
        this.producerStatusEnum = producerStatusEnum;
    }

    public Date getStartCooperationDate() {
        return startCooperationDate;
    }

    public void setStartCooperationDate(Date startCooperationDate) {
        this.startCooperationDate = startCooperationDate;
    }

    public Date getEndCooperationDate() {
        return endCooperationDate;
    }

    public void setEndCooperationDate(Date endCooperationDate) {
        this.endCooperationDate = endCooperationDate;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }
}
