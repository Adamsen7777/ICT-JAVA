
package inheritance2;


public class Inheritance2 {

    
    public static void main(String[] args) {
        PUPPY obj = new PUPPY();
         
        obj.mothername = "DEFFY";
        obj.age = 2;
        obj.orgin = "GERMANY"; 
        obj.price= 15000;
        obj.name = "LARA";
        
        obj.pet();
        obj.pet(1);
       
    }
    
}
