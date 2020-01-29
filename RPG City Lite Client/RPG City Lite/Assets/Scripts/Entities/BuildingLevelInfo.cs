using System.Collections;
using System.Collections.Generic;

public class BuildingLevelInfo
{
    int buildingId;
    string buildingName;
    string description;
    string image;
    int level;
    HashSet<BuildingAction> buildingActions;
    HashSet<BuildingRequirement> buildingRequirements;

    public int BuildingId { get => buildingId; set => buildingId = value; }
    public string BuildingName { get => buildingName; set => buildingName = value; }
    public string Description { get => description; set => description = value; }
    public string Image { get => image; set => image = value; }
    public int Level { get => level; set => level = value; }
    public HashSet<BuildingAction> BuildingActions { get => buildingActions; set => buildingActions = value; }
    public HashSet<BuildingRequirement> BuildingRequirements { get => buildingRequirements; set => buildingRequirements = value; }
}


