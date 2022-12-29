
package superclass;


public class Demo {
    int a =7777;
    void nemo(){
        System.out.println("i love fishes");
    }
    
}
class Fishes extends Demo{
    int a=2222;
    void nemo(){
        System.out.println(super.a);
        super.nemo();
        
    }
}
