using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class GameWindowController : MonoBehaviour
{
    public static GameWindowController instance = null;
    public GameObject activeMenuPanel;
    public GameObject activeDisplayPanel;
    public GameObject popupPanel;
    public GameObject MainMenuPanel;
    public GameObject MainPanel;

     void Awake()
    {
        if (instance == null)
            instance = this;
        else if (instance != this)
            Destroy(gameObject);
    }

    void Start()
    {
        activeMenuPanel = MainMenuPanel;
        activeDisplayPanel = MainPanel;
        activeMenuPanel.SetActive(true);
        activeDisplayPanel.SetActive(true);
    }

    public void setDisplayPanel(GameObject displayPanel)
    {
        activeDisplayPanel.SetActive(false);
        activeDisplayPanel = displayPanel;
        activeDisplayPanel.SetActive(true);
    }

    public void setMenuPanel(GameObject menuPanel)
    {
        activeMenuPanel.SetActive(false);
        activeMenuPanel = menuPanel;
        activeMenuPanel.SetActive(true);
    }

    public void openPopup(GameObject popup)
    {
        popupPanel.SetActive(true);
        popup.SetActive(true);
    }

    public void closePopup(GameObject popup)
    {
        popup.SetActive(false);
        popupPanel.SetActive(false);
    }
}
