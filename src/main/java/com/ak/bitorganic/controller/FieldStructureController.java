package com.ak.bitorganic.controller;

import com.ak.bitorganic.dto.fieldstructure.FieldStructureCreateDto;
import com.ak.bitorganic.dto.fieldstructure.FieldStructureDto;
import com.ak.bitorganic.service.FieldStructureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/field_structure")
public class FieldStructureController {
    @Autowired
    private FieldStructureService fieldStructureService;

    @PostMapping("/save")
    public ResponseEntity<Boolean> saveFieldStructure(@RequestBody FieldStructureCreateDto fieldStructureCreateDto) {
        return new ResponseEntity<>(fieldStructureService.saveFieldStructure(fieldStructureCreateDto), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteFieldStructure(@PathVariable("id") Long id) {
        return new ResponseEntity<>(fieldStructureService.deleteFieldStructure(id), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FieldStructureDto> searchBatches(@PathVariable("id") Long id) {
        return new ResponseEntity<>(fieldStructureService.findByFieldStructureId(id), HttpStatus.OK);
    }
}
