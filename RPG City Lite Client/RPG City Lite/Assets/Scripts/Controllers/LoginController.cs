using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class LoginController : MonoBehaviour { 

    public Text username;
    public InputField password;

    public string responseText;
    public Text statusMessage;

    void Start()
    {
        statusMessage.text = "";
    }

    public void Login()
    {
        statusMessage.text = "Sending login...";
        // call login endpoint, and get back a player object
        Debug.Log("Sending Authentication to server.");
        Player player = new Player();
        player.username = username.text;
        player.password = password.text;

        string url = RestUtil.LOGIN_SERVICE_URI;
        string jsonData = JsonUtility.ToJson(player);
        Debug.Log("Sending post json data: " + jsonData);
        responseText = RestUtil.Instance.Post(url, jsonData).text;
        Debug.Log("Json Response: " + responseText);
        Player loggedInUser = JsonUtility.FromJson<Player>(responseText);
        if (loggedInUser != null)
        {
            Debug.Log("Returned login info: " + loggedInUser.ToString());
            // we have set a good login - lets set some session variables
            PlayerPrefs.SetString("user", loggedInUser.username);
            statusMessage.text = "Login success!";
           

        }
        else if (loggedInUser == null)
        {
            statusMessage.text = "Authentication failed.";
        }
        else
        {
            statusMessage.text = "Error connecting to server. Please try again later.";
        }

       
    }
}
