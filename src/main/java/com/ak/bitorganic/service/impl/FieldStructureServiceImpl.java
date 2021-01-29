package com.ak.bitorganic.service.impl;

import com.ak.bitorganic.domain.FieldStructure;
import com.ak.bitorganic.domain.Producer;
import com.ak.bitorganic.domain.Product;
import com.ak.bitorganic.dto.fieldstructure.FieldStructureCreateDto;
import com.ak.bitorganic.dto.fieldstructure.FieldStructureDto;
import com.ak.bitorganic.exception.NotFoundException;
import com.ak.bitorganic.mapper.FieldStructureMapper;
import com.ak.bitorganic.repository.FieldStructureRepository;
import com.ak.bitorganic.repository.ProducerRepository;
import com.ak.bitorganic.repository.ProductRepository;
import com.ak.bitorganic.service.FieldStructureService;
import org.springframework.stereotype.Service;

@Service
public class FieldStructureServiceImpl implements FieldStructureService {

    private FieldStructureRepository fieldStructureRepository;
    private ProductRepository productRepository;
    private ProducerRepository producerRepository;

    private FieldStructureMapper fieldStructureMapper;

    public FieldStructureServiceImpl(FieldStructureRepository fieldStructureRepository,
                                     ProductRepository productRepository,
                                     ProducerRepository producerRepository,
                                     FieldStructureMapper fieldStructureMapper) {
        this.fieldStructureRepository = fieldStructureRepository;
        this.productRepository = productRepository;
        this.producerRepository = producerRepository;
        this.fieldStructureMapper = fieldStructureMapper;
    }

    @Override
    public boolean saveFieldStructure(FieldStructureCreateDto fieldStructureCreateDto) {
        FieldStructure fieldStructure = new FieldStructure();
        Product product = productRepository.findByProductDesignation(fieldStructureCreateDto.getProductDesignation())
                .orElseThrow(() -> new NotFoundException(String.format("Product with designation: %s not found.", fieldStructureCreateDto.getProductDesignation())));
        Producer producer = producerRepository.findByProducerId(fieldStructureCreateDto.getProducerId())
                .orElseThrow(() -> new NotFoundException(String.format("Producer with id: %d not found.", fieldStructureCreateDto.getProducerId())));
        fieldStructure.setProducer(producer);
        fieldStructure.setProduct(product);
        fieldStructure.setAcreage(fieldStructureCreateDto.getAcreage());
        FieldStructure savedField = fieldStructureRepository.save(fieldStructure);
        if(savedField == null) return false;
        //producer.addFieldStructure(fieldStructure);
        //Object savedProducer = producerRepository.save(producer);
        //if (savedProducer == null) return false;
        return true;
    }

    @Override
    public boolean updateFieldStructure(FieldStructureCreateDto fieldStructureCreateDto) {
        return false;
    }

    @Override
    public boolean deleteFieldStructure(Long fieldStructureId) {
        Long deletedField = fieldStructureRepository.deleteByFiledStructureId(fieldStructureId);
        if (deletedField == 0)return false;
        return true;
    }

    @Override
    public FieldStructureDto findByFieldStructureId(Long fieldStructureId) {
        FieldStructure fieldStructure = fieldStructureRepository.findByFiledStructureId(fieldStructureId)
                .orElseThrow(() -> new NotFoundException(String.format("Field structure with id: %d not found.", fieldStructureId)));
        return fieldStructureMapper.fieldStructureToFieldStructureDto(fieldStructure);
    }
}
