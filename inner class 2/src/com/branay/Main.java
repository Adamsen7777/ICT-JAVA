
package com.branay;


public class Main {

    
    public static void main(String[] args) {
        
       brand obj1 = new brand();
       brand.Superbike obj2 = obj1.new Superbike();
       
        System.out.println("brand name:" + obj1.name);
        System.out.println("Superbike model:" + obj2.model);
        
          obj2.race();
       
       
        
    }
    
}
