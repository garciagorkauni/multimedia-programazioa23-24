using System.Collections;
using System.Collections.Generic;
using System.Linq.Expressions;
using UnityEngine;

public class MovementScript : MonoBehaviour
{
    // Define variables
    public float speed = 5f;
    public string direction;
    public Vector3 movement;

    // Start is called before the first frame update
    void Start()
    {
        // Define the initial position
        transform.position = Vector3.zero;
        direction = "Forward";
        movement = Vector3.forward;
    }

    // Update is called once per frame
    void Update()
    {
        // Move the object
        transform.position += movement*speed*Time.deltaTime;

        // Define the movement depending on each direction
        if (direction.Equals("Forward") && transform.position.z >= 10)
        {
            direction = "Right";
            movement = Vector3.right;
        } 
        else if (direction.Equals("Right") && transform.position.x >= 10)
        {
            direction = "Back";
            movement = Vector3.back;
        }
        else if (direction.Equals("Back") && transform.position.z <= 0)
        {
            direction = "Left";
            movement = Vector3.left;
        }
        else if (direction.Equals("Left") && transform.position.x <= 0)
        {
            direction = "Forward";
            movement = Vector3.forward;
        }

    }
}
