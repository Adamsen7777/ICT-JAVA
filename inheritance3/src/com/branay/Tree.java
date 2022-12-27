
package com.branay;


public class Tree {
    String treename;
    int height;
    
    void growing(){
        System.out.println(  treename  + "is a big tree" + " and height is " + height);
    } 
}
 class Furniture extends Tree{
     String name;
     int price;
     
     void home(){
         System.out.println(name + " is used for home and price is " + price);
     }
     
 }