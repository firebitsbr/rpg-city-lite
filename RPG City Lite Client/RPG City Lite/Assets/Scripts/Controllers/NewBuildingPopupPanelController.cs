using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using Newtonsoft.Json;

public class NewBuildingPopupPanelController : MonoBehaviour
{
    public GameObject buildingListPanel;
    public GameObject newBuildingObject;
    public List<BuildingLevelInfo> buildingList;

    public void OnEnable()
    {
        buildingList = new List<BuildingLevelInfo>();

        string url = RestUtil.NEW_BUILDING_URL;
        string responseText = RestUtil.Instance.Get(url);
        Debug.Log("Json Response: " + responseText);
        buildingList = JsonConvert.DeserializeObject<List<BuildingLevelInfo>>(responseText);

        foreach(BuildingLevelInfo building in buildingList)
        {
            var buildingObj = GameObject.Instantiate(newBuildingObject);
            buildingObj.transform.parent = buildingListPanel.transform;
            buildingObj.GetComponent<NewBuildingPanelController>().UpdateBuildingView(building);
        }
    }

    public void upClick()
    {

    }

    public void downClick()
    {

    }

    public void buildClick()
    {

    }

    public void backClick()
    {
        GameWindowController.instance.closePopup(this.gameObject);
    }
}
