
package pkgclass.and.obj.demo;

public class ClassAndObjDemo {

    public static void main(String[] args) {
       
    Fruits apple = new Fruits();
    Fruits mango = new Fruits();
    
    apple.name ="APPLE";
    mango.name ="MANGO";
    
    apple.seeds = 5;
    mango.seeds= 1;
    
    apple.taste ="SWEETY";
    mango.taste =" PULPY";
    
    apple.color();
    apple.price();
    
    mango.color();
    mango.price();
    

    }
}
