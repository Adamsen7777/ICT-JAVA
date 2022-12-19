/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author ADAMSEN BRANAY
 */
interface gayathri{
     void crush();
     
    
}
interface berlisha{
     void friend();
    
}
interface hincy{
     void best();
    
}






public class inter implements gayathri,berlisha,hincy {

    @Override
    public void crush() {
        System.out.println( " recent crush");
        
    }

    @Override
    public void friend() {
        System.out.println( " bestiee");
    }

    @Override
    public void best() {
        System.out.println( " good girl");
    }
    
}
