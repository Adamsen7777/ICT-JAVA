/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.branay;

/**
 *
 * @author ADAMSEN BRANAY
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Airpods apple = new Airpods();
        Airpods boat = new Airpods();
        
        apple.brand = "APPLE";
        boat.brand = "BOAT";
        
        apple.price = 5000;
        boat.price= 6000;
        
        apple.sound();
        apple.cost();
        
        boat.sound();
        boat.cost();
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
