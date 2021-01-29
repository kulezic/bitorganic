package com.ak.bitorganic.controller;

import com.ak.bitorganic.domain.Batch;
import com.ak.bitorganic.dto.batch.BatchDto;
import com.ak.bitorganic.service.BatchService;
import com.sipios.springsearch.anotation.SearchSpec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/batch")
public class BatchController {

    @Autowired
    private BatchService batchService;

    @GetMapping
    public ResponseEntity<List<BatchDto>> findAllBatches() {
        return new ResponseEntity<>(batchService.findAllBatches(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BatchDto> findByBatchId(@PathVariable("id") Long id) {
        return new ResponseEntity<>(batchService.findByBatchId(id), HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<List<BatchDto>> searchBatches(@SearchSpec Specification<Batch> specs) {
        return new ResponseEntity<>(batchService.searchBatches(specs), HttpStatus.OK);
    }

}
