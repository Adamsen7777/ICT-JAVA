/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logical.operators;

/**
 *
 * @author ADAMSEN BRANAY
 */
public class LogicalOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int age = 55;
//        boolean voting_registerd = true;
//        if(age >= 18){
//            if(voting_registerd){
//                System.out.println("you are elgible to vote");
//            }else{
//                System.out.println("your are not elgible to vote");
//            }
//        }else{
//            System.out.println("you are not elgible to vote");
//        }
        

      int age = 55;
      boolean voting_registerd = true;
      if(age>=18 && voting_registerd){
          System.out.println("you are elgible to vote");
      }else{
          System.out.println("your are not elgible to vote");
      }
          

    }
    
    
}