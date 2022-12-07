/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flowers;

/**
 *
 * @author ADAMSEN BRANAY
 */
public class Flowers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        plant rose =new plant();
        plant lily =new plant();
        
        rose.name ="ROSE";
        lily.name ="LILY";
        
        rose.colors = "red";
        lily.colors = "blue";
        
        rose.leaves = 5;
        lily.leaves = 8;
        
        rose.beauty();
        lily.beauty();
        
    }
    
}
