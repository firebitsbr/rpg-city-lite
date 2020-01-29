package com.jbcomputers.rpgcitylite.dtos;

import com.jbcomputers.rpgcitylite.entities.BuildingAction;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
public class GameBuildingDetail {
    Long gbId;
    Integer buildingId;
    Long playerId;
    Long heroId;
    String buildingName;
    String description;
    String image;
    int level;
    String status;
    Timestamp time;
    int slot;
    List<BuildingAction> buildingActions;
}
