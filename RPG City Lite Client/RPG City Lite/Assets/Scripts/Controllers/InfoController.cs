using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class InfoController : MonoBehaviour
{

    public GameObject mainMenu;
    public GameObject mainPanel;

    public void backClick()
    {
        GameWindowController.instance.setDisplayPanel(mainPanel);
        GameWindowController.instance.setMenuPanel(mainMenu);
    }
}
