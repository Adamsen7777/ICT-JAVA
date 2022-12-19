/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loan.project;

/**
 *
 * @author ADAMSEN BRANAY
 */
public class LoanProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bank canara =new bank();
        bank icici = new bank();
        bank citi = new bank();
        
        canara.name = "CANARA";
        icici.name = "ICICI";
        citi.name ="CITI";
        
        canara.loanamount =35000;
        icici.loanamount = 40000;
        citi.loanamount = 50000;
        
        canara.intrest = 7;
        icici.intrest = 8;
        citi.intrest = 9;
        
        canara.gold_loan();
        canara.car_loan();
        
        citi.gold_loan();
        icici.car_loan();
                
    }
    
}
