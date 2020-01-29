package com.jbcomputers.rpgcitylite.services;

import com.jbcomputers.rpgcitylite.dtos.BuildingLevelInfo;
import com.jbcomputers.rpgcitylite.entities.Building;
import com.jbcomputers.rpgcitylite.entities.BuildingAction;
import com.jbcomputers.rpgcitylite.entities.BuildingRequirement;
import com.jbcomputers.rpgcitylite.repositories.BuildingActionRepository;
import com.jbcomputers.rpgcitylite.repositories.BuildingRepository;
import com.jbcomputers.rpgcitylite.repositories.BuildingRequirementRepository;
import com.jbcomputers.rpgcitylite.repositories.GameBuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class BuildingInfoService {

    @Autowired
    BuildingRepository buildingRepository;

    @Autowired
    BuildingRequirementRepository buildingRequirementRepository;

    @Autowired
    BuildingActionRepository buildingActionRepository;

    @Autowired
    GameBuildingRepository gameBuildingRepository;

    public List<BuildingLevelInfo> getListOfNewBuildings() {
        List<BuildingLevelInfo> newBuildings = new ArrayList();
        List<Building> buildings = buildingRepository.findAll();
        for(Building building: buildings) {
            BuildingLevelInfo buildingLevelInfo = new BuildingLevelInfo();
            buildingLevelInfo.setBuildingId(building.getId());
            buildingLevelInfo.setBuildingName(building.getBuildingName());
            buildingLevelInfo.setDescription(building.getDescription());
            buildingLevelInfo.setLevel(1);
            Set<BuildingAction> newBuildingActions = new HashSet();
            Set<BuildingRequirement> newBuildingRequirements = new HashSet();
             for(BuildingAction action: building.getBuildingActions()) {
                if (action.getLevel() == 1) {
                    newBuildingActions.add(action);
                }
             }
             for(BuildingRequirement requirement: building.getBuildingRequirements()) {
                 if (requirement.getLevel() == 1) {
                     newBuildingRequirements.add(requirement);
                 }
             }
             buildingLevelInfo.setBuildingActions(newBuildingActions);
             buildingLevelInfo.setBuildingRequirements(newBuildingRequirements);
             newBuildings.add(buildingLevelInfo);
        }

        return newBuildings;
    }
}
