using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class MainMenuController : MonoBehaviour
{
    public GameObject infoPanel;
    public GameObject infoMenu;
    public GameObject buildingPanel;
    public GameObject buildingMenu;
    public void upClick()
    {

    }

    public void downClick()
    {

    }

    public void heroesClick()
    {

    }

    public void buildingsClick()
    {
        GameWindowController.instance.setDisplayPanel(buildingPanel);
        GameWindowController.instance.setMenuPanel(buildingMenu);
    }

    public void adventuresClick()
    {

    }

    public void infoClick()
    {
        GameWindowController.instance.setDisplayPanel(infoPanel);
        GameWindowController.instance.setMenuPanel(infoMenu);
    }

    public void inventoryClick()
    {

    }

    public void chatClick()
    {

    }

    public void alliancesClick()
    {

    }

    public void pvpClick()
    {

    }

    public void leaderboardsClick()
    {

    }

    public void optionsClick()
    {

    }
}
