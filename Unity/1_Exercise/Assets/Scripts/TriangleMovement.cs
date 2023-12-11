using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class TriangleMovement : MonoBehaviour
{
    public Vector3 primerPunto;
    public Vector3 segundoPunto;
    public Vector3 tercerPunto;
    public float hipotenusa;
    public float kateto;
    public float velocidad = 10.0f;

    void Start()
    {
        hipotenusa = 16.0f;

        primerPunto = new Vector3(0f, 0f, 0f);
        segundoPunto = new Vector3(hipotenusa, 0, 0);
        tercerPunto = new Vector3(hipotenusa / 2.0f, 0f, ((float)System.Math.Sqrt(3) * hipotenusa) / 2.0f);
    }

    void Update()
    {
        if (transform.position.x <= segundoPunto.x && transform.position.z == 0)
        {
            GetComponent<Renderer>().material.color = Color.green;
            float disA = Vector3.Distance(transform.position, segundoPunto);
            if (disA < 0.1)
            {
                transform.position = segundoPunto;

            }
            transform.position += new Vector3(1f, 0, 0) * velocidad * Time.deltaTime;
        }
        else if (transform.position.x >= tercerPunto.x && transform.position.z < tercerPunto.z)
        {
            GetComponent<Renderer>().material.color = Color.blue;
            float disB = Vector3.Distance(transform.position, tercerPunto);
            if (disB < 0.01)
            {
                transform.position = tercerPunto;
            }
            Vector3 dirección = (tercerPunto - transform.position).normalized;
            transform.position += dirección * velocidad * Time.deltaTime;
        }
        else
        {
            GetComponent<Renderer>().material.color = Color.magenta;
            float disC = Vector3.Distance(transform.position, primerPunto);
            if (disC < 0.1)
            {
                transform.position = primerPunto;

            }
            Vector3 dirección2 = (primerPunto - transform.position).normalized;
            transform.position += dirección2 * velocidad * Time.deltaTime;
        }
    }
}