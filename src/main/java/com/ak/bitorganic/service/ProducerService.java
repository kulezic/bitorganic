package com.ak.bitorganic.service;

import com.ak.bitorganic.domain.Producer;
import com.ak.bitorganic.dto.producer.ProducerCreateDto;
import com.ak.bitorganic.dto.producer.ProducerDto;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface ProducerService {

    boolean saveProducer(ProducerCreateDto producerCreateDto);
    boolean updateProducer(ProducerCreateDto producerCreateDto);
    boolean deleteProducer(Long producerId);

    ProducerDto findByProducerId(Long producerId);

    List<ProducerDto> findAllProducers();
    List<ProducerDto> searchProducers(Specification<Producer> specification);

}
