package com.ak.bitorganic.service.impl;

import com.ak.bitorganic.domain.Group;
import com.ak.bitorganic.domain.Producer;
import com.ak.bitorganic.dto.producer.ProducerCreateDto;
import com.ak.bitorganic.dto.producer.ProducerDto;
import com.ak.bitorganic.enums.OrganicStatusEnum;
import com.ak.bitorganic.exception.NotFoundException;
import com.ak.bitorganic.mapper.ProducerMapper;
import com.ak.bitorganic.repository.GroupRepository;
import com.ak.bitorganic.repository.ProducerRepository;
import com.ak.bitorganic.service.ProducerService;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProducerServiceImpl implements ProducerService {

    private ProducerRepository producerRepository;
    private GroupRepository groupRepository;

    private ProducerMapper producerMapper;

    public ProducerServiceImpl(ProducerRepository producerRepository,
                               GroupRepository groupRepository,
                               ProducerMapper producerMapper) {
        this.producerRepository = producerRepository;
        this.groupRepository = groupRepository;
        this.producerMapper = producerMapper;
    }

    @Override
    public boolean saveProducer(ProducerCreateDto producerCreateDto) {
        Producer producer = new Producer();
        Group group = null;
        if(producerCreateDto.getGroupId() != null) group = groupRepository.findByGroupId(producerCreateDto.getGroupId())
                .orElseThrow(() -> new NotFoundException(String.format("Group with id: %d not found.", producerCreateDto.getGroupId())));
        producer.setProducerNumber(producerCreateDto.getProducerNumber());
        producer.setName(producerCreateDto.getName());
        producer.setSurname(producerCreateDto.getSurname());
        producer.setBPG(producerCreateDto.getBPG());
        producer.setGroup(group);
        producer.setOrganicStatus(OrganicStatusEnum.valueOf(producerCreateDto.getOrganicStatus()));
        if (producerRepository.save(producer) == null) return false;
        return true;
    }

    @Override
    public boolean updateProducer(ProducerCreateDto producerCreateDto) {
        return false;
    }

    @Override
    public boolean deleteProducer(Long producerId) {
        if (producerRepository.deleteByProducerId(producerId) == 0) return false;
        return true;
    }

    @Override
    public ProducerDto findByProducerId(Long producerId) {
        Producer producer = producerRepository.findByProducerId(producerId)
                .orElseThrow(() -> new NotFoundException(String.format("Producer with id: %d not found.", producerId)));
        return producerMapper.producerToProducerDto(producer);
    }

    @Override
    public List<ProducerDto> findAllProducers() {
        return producerRepository.findAll().stream()
                .map(producerMapper::producerToProducerDto).collect(Collectors.toList());
    }

    @Override
    public List<ProducerDto> searchProducers(Specification<Producer> specification) {
        return producerRepository.findAll(Specification.where(specification)).stream()
                .map(producerMapper::producerToProducerDto).collect(Collectors.toList());
    }
}
