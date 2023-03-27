
package simple.calculator;

import java.util.Scanner;


public class SimpleCalculator {

   
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("enter firstnumber");
        
        double firstnumber = scanner.nextDouble();
        System.out.println("Enter secondnumber");
        double secondnumber = scanner.nextDouble();
        
        double answer =firstnumber * secondnumber;
        System.out.println("answer " + answer);
         
    }
    
}
