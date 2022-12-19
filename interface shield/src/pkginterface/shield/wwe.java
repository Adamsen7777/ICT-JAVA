/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface.shield;

/**
 *
 * @author ADAMSEN BRANAY
 */
interface roman{
    void player();
}
 
interface seth{
    void hero();
}

interface dean {
    void champ();
}




public class wwe implements roman,seth,dean{

    @Override
    public void player() {
      System.out.println("i hate");
    }

    @Override
    public void hero() {
        System.out.println("beast");
    }

    @Override
    public void champ() {
       System.out.println("cunning player"); 
    }
    
}
