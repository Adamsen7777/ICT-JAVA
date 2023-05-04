
package demo.calculator;

import java.util.Scanner;


public class DemoCalculator {

    
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first number");
        double firstnumber = scanner.nextDouble();
        
        System.out.println("Enter second number");
        double secondnumber = scanner.nextDouble();
        
        double answer = firstnumber + secondnumber;
        System.out.println("sum is " + answer);
        
        
        
         
        
    }
}
        
    
