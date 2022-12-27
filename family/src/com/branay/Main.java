
package com.branay;


public class Main {

    
    public static void main(String[] args) {
        My_family raja = new My_family();
         My_family adam = new My_family();
         My_family ezhil = new My_family();
          My_family bretlee = new My_family();
         
        
        raja.name ="RAJA";
        adam.name = "ADAM";
        ezhil.name ="EZHIL";
        bretlee.name = "BRETLEE";
        
        raja.age=60;
        adam.age=23;
        ezhil.age=50;
        bretlee.age=17;
        
        adam.blessed();
        raja.blessed();
        ezhil.blessed();
        bretlee.blessed();
        adam.good();
        
    }
    
}
