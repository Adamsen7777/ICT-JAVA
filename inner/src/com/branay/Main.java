
package com.branay;


public class Main {

    
    public static void main(String[] args) {
        
        Company company = new Company();
        Company.Car car = company.new Car();
        
        System.out.println("company name:" + company.name);
        System.out.println("car model:" + car.model);
                
        
        car.supercar();
    }
    
}
