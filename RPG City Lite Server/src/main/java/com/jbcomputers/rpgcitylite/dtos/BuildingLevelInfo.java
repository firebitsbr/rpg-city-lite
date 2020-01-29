package com.jbcomputers.rpgcitylite.dtos;

import com.jbcomputers.rpgcitylite.entities.BuildingAction;
import com.jbcomputers.rpgcitylite.entities.BuildingRequirement;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Getter
@Setter
public class BuildingLevelInfo {
    Integer buildingId;
    String buildingName;
    String description;
    String image;
    int level;
    Set<BuildingAction> buildingActions;
    Set<BuildingRequirement> buildingRequirements;
}
