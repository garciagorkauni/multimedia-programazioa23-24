using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class HelloWorld : MonoBehaviour
{
    public Text textScreen;
    // Start is called before the first frame update
    void Start()
    {
        textScreen.text = "Hello world!";
    }
}
