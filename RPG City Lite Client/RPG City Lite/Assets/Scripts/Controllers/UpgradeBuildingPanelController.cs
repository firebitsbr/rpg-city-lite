using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class UpgradeBuildingPanelController : MonoBehaviour
{

    public void upgradeClick()
    {

    }

    public void backClick()
    {
        GameWindowController.instance.closePopup(this.gameObject);
    }

}
