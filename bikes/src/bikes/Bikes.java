/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bikes;

/**
 *
 * @author ADAMSEN BRANAY
 */
public class Bikes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        collection s1000rr = new collection();
        collection panigale = new collection();
        collection duke = new collection();
        
        s1000rr.name="s1000rr";
        panigale.name="PANIGALE";
        duke.name="DUKE";
        
        s1000rr.brand="bmw";
        panigale.brand="ducati";
        duke.brand="KTM";
        
        s1000rr.price= 250000;
        panigale.price=300000;
        duke.price=160000;
        
        s1000rr.superbikes();
        panigale.superbikes();
        duke.race();
        
        
      
    }
    
}
