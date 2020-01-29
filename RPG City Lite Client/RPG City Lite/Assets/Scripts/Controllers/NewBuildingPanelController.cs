using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class NewBuildingPanelController : MonoBehaviour
{
    public BuildingLevelInfo buildingInfo;
    public Text buildingName;
    public Text buildingDescription;
    public GameObject requirement;
    public GameObject action;

    public void UpdateBuildingView(BuildingLevelInfo buildingLevelInfo)
    {
        buildingInfo = buildingLevelInfo;
        buildingName.text = buildingInfo.BuildingName;
        buildingDescription.text = buildingInfo.Description;
    }

}
