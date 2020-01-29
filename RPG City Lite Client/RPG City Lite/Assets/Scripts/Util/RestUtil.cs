using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using System.Net;
using System.IO;

public class RestUtil: MonoBehaviour
{
    public static string SERVER_ROOT = "http://192.168.39.144:8080";
    public static RestUtil _instance;
    public static string LOGIN_SERVICE_URI = SERVER_ROOT + "/login";
    public static string REGISTER_SERVICE_URI = SERVER_ROOT + "/register";
    public static string PLAYER_SERVICE_URI =  SERVER_ROOT + "/player";
    public static string NEW_BUILDING_URL = SERVER_ROOT + "/building/new";

    public static RestUtil Instance { get { return _instance; } }

    private void Awake()
    {
        if (_instance != null && _instance != this)
        {
            Destroy(this.gameObject);
        }
        else
        {
            _instance = this;
            Debug.Log("Rest Util initialized.");
        }
    }

    public static string fixJson(string type, string value)
    {
        value = "{\"" + type + "\":" + value + "}";
        return value;
    }

    public string Get(string url)
    {
        Debug.Log("Sending request to " + url);
        HttpWebRequest request = (HttpWebRequest)WebRequest.Create(url);
        HttpWebResponse response = (HttpWebResponse)request.GetResponse();
        Debug.Log("Response received: " + response.StatusCode);
        StreamReader reader = new StreamReader(response.GetResponseStream());
        string jsonResponse = reader.ReadToEnd();
        return jsonResponse;
    }

    public WWW Post(string url, string json)
    {
        Debug.Log("Sending a post request to: " + url);
        WWW www;
        Hashtable postHeader = new Hashtable();
        postHeader.Add("Content-Type", "application/json");

        // convert json string to bytes
        var jsonData = System.Text.Encoding.UTF8.GetBytes(json);
        Debug.Log("www request being sent to server now.");
        www = new WWW(url, jsonData, postHeader);

        StartCoroutine(WaitForRequest(www));
        return www;
    }

    IEnumerator WaitForRequest(WWW data)
    {

        WaitForSeconds w;
        while (!data.isDone)
        {
            w = new WaitForSeconds(0.1f);
        }

        if (data.error != null)
        {
            Debug.Log("There was an error sending request: " + data.error);
        }
        else
        {
            Debug.Log("WWW Request: " + data.text);
        }

        return data;
    }
}
