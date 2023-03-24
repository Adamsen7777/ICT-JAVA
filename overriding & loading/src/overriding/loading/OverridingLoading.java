
package overriding.loading;


public class OverridingLoading {

    
    public static void main(String[] args) {
        
        weight apple = new weight ();
        
        apple.name = "APPLE";
        apple.value =20;
        
        apple.kilo();
        
        
        load orange = new load();
        
        orange.name = "ORANGE";
        orange.age = 7;
        
        orange.kilo ();
        orange.kilo(10);
                
    }
    
}
