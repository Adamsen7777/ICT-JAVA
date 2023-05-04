
package logical.operators.demo;


public class LogicalOperatorsDemo {

    
    public static void main(String[] args) {
        int age =5;
        boolean voting_registered = true;
        
        if( age >=18 && voting_registered){
            System.out.println("You can vote");
        }
        else{
            System.out.println("you are not elgible to vote");
        }
    }
    
}
