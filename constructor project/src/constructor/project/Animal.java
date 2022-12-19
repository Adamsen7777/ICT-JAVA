/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructor.project;

/**
 *
 * @author ADAMSEN BRANAY
 */
public class Animal {
    String name;
    int speed;
    void animalspeed()
    {
        System.out.println(name+" runs at "+speed+" km/hr.");
    }
    Animal()
    {
        name="LION";
        speed=60;
    }
    Animal(int i)
    {
        name="TIGER";
        speed=80;
    }
}
