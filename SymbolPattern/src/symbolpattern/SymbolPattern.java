
package symbolpattern;


public class SymbolPattern {

    public static void main(String[] args) {
         int rows = 5;
        char symbol = '*';
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}
    
