package com.ak.bitorganic.controller;

import com.ak.bitorganic.domain.Group;
import com.ak.bitorganic.dto.group.GroupCreateDto;
import com.ak.bitorganic.dto.group.GroupDto;
import com.ak.bitorganic.service.GroupService;
import com.sipios.springsearch.anotation.SearchSpec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/group")
public class GroupController {

    @Autowired
    private GroupService groupService;

    //TODO Provera da li je f-ja vratila true
    @PostMapping("/save")
    ResponseEntity<Boolean> saveGroup(@RequestBody GroupCreateDto groupCreateDto){
        return new ResponseEntity<>(groupService.saveGroup(groupCreateDto), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    ResponseEntity<Boolean> deleteGroup(@PathVariable("id") Long id){
        return new ResponseEntity<>(groupService.deleteGroup(id), HttpStatus.OK);
    }

    @GetMapping
    ResponseEntity<List<GroupDto>> findAllGroups(){
        return new ResponseEntity<>(groupService.findAllGroups(), HttpStatus.OK);
    }

    @GetMapping("/search")
    ResponseEntity<List<GroupDto>> searchGroups(@SearchSpec Specification<Group> specs){
        return new ResponseEntity<>(groupService.searchGroups(specs), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    ResponseEntity<GroupDto> findByGroupId(@PathVariable("id") Long id){
        return new ResponseEntity<>(groupService.findByGroupId(id), HttpStatus.OK);
    }
}
