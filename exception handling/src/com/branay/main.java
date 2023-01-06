
package com.branay;

import java.util.Scanner;


public class main {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        try{
         int num1 = scanner.nextInt();
         int num2 = scanner.nextInt(); 
         
         System.out.println(num1/num2);
    }catch(Exception e){
            System.out.println("num2 cannot be 0");
}
    }
}
