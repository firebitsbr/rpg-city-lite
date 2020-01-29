package com.jbcomputers.rpgcitylite.controllers;

import com.jbcomputers.rpgcitylite.dtos.BuildingLevelInfo;
import com.jbcomputers.rpgcitylite.services.BuildingInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/building")
public class BuildingController {

    @Autowired
    BuildingInfoService buildingInfoService;

    // pull building list for users build menu
    @GetMapping(value="/new")
    public ResponseEntity<List<BuildingLevelInfo>> getBuildingLevelInfo() {
        return new ResponseEntity<>(buildingInfoService.getListOfNewBuildings(), HttpStatus.OK);
    }

    // pull details on building in built list

    // validate resources then build selected building

    // validate resources then upgrade selected building

}
