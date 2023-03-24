
package com;


public class BRANAY {

    
    public static void main(String[] args) {
        BRAND obj1 = new BRAND();
        BRAND.mobile obj2 = obj1.new mobile();
        
         System.out.println("brand name:" + obj1.name);
      System.out.println(" model:" + obj2.model);
        
          obj2.smart();
        
        
        
    }
    
}
