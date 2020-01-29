using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class BuildingMenuController : MonoBehaviour
{
    public GameObject mainPanel;
    public GameObject mainMenu;
    public GameObject newBuildingPopup;
    public GameObject upgradeBuildingPopup;
    
    public void buildNewClick()
    {
        GameWindowController.instance.openPopup(newBuildingPopup);
    }

    public void upgradeClick()
    {
        GameWindowController.instance.openPopup(upgradeBuildingPopup);
    }

    public void assignClick()
    {

    }

    public void demolishClick()
    {

    }

    public void upClick()
    {

    }

    public void downClick()
    {

    }

    public void backClick()
    {
        GameWindowController.instance.setDisplayPanel(mainPanel);
        GameWindowController.instance.setMenuPanel(mainMenu);
    }
}
