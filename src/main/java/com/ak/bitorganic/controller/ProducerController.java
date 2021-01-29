package com.ak.bitorganic.controller;

import com.ak.bitorganic.domain.Producer;
import com.ak.bitorganic.dto.producer.ProducerCreateDto;
import com.ak.bitorganic.dto.producer.ProducerDto;
import com.ak.bitorganic.service.ProducerService;
import com.sipios.springsearch.anotation.SearchSpec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producer")
public class ProducerController {
    @Autowired
    private ProducerService producerService;

    @PostMapping("/save")
    ResponseEntity<Boolean> saveProducer(@RequestBody ProducerCreateDto producerCreateDto){
        return new ResponseEntity<>(producerService.saveProducer(producerCreateDto), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    ResponseEntity<Boolean> deleteProducer(@PathVariable("id") Long id){
        return new ResponseEntity<>(producerService.deleteProducer(id), HttpStatus.OK);
    }

    @GetMapping
    ResponseEntity<List<ProducerDto>> findAllProducers(){
        return new ResponseEntity<>(producerService.findAllProducers(), HttpStatus.OK);
    }

    @GetMapping("/search")
    ResponseEntity<List<ProducerDto>> searchGroups(@SearchSpec Specification<Producer> specs){
        return new ResponseEntity<>(producerService.searchProducers(specs), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    ResponseEntity<ProducerDto> findByGroupId(@PathVariable("id") Long id){
        return new ResponseEntity<>(producerService.findByProducerId(id), HttpStatus.OK);
    }
}
