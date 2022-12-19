/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interface2;

/**
 *
 * @author ADAMSEN BRANAY
 */
interface adam{
    void slimboy();
}
interface anon{
    void fatboy();
}
interface bravin{
    void shortboy();
}

public class boys implements adam,anon,bravin{

    @Override
    public void slimboy() {
        System.out.println ( " olliya irunthalum  gilli ma ");
        
    }

    @Override
    public void fatboy() {
        System.out.println (" gundu posanika");
       
    }

    @Override
    public void shortboy() {
      System.out.println(" bmw boy ");
    }
    
    
}
