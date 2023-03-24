
package overriding.loading;


class weight{
    String name;
    int value;
    
    void kilo(){
        System.out.println( name + value);
    }
    
}


public class load extends weight {
    String name;
    int age;
    
    
    @Override
    void kilo(){
        System.out.println( name + age);
    }
    void kilo(int i){
        System.out.println("Hello");
    }
    
}
