/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package building.simple.calculator;

import java.util.Scanner;

/**
 *
 * @author ADAMSEN BRANAY
 */
public class BuildingSimpleCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter firstnumber");
        double firstNumber =scanner.nextDouble();
        
        System.out.println("Enter secondnumber");
        double secondNumber = scanner.nextDouble();
        
        double answer = firstNumber + secondNumber;
        System.out.println("sum is " + answer);
                
                
                
                
        
                
    }
    
}
