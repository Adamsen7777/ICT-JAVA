
package com.branay;

public class Main {

    public static void main(String[] args) {
        newclass ncobj = new newclass();
        ncobj.show();
    }
    
}
      class superclass{
          int a=19;
          
          void show(){
              System.out.println("i luv u");
          }
      } 
    class newclass extends superclass{
        int a=7;
        
        void show(){
            System.out.println(a);
            System.out.println(super.a);
            super.show();
        }
        
        
    
    }   
    
    

