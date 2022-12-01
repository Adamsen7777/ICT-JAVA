/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank_project;

/**
 *
 * @author ADAMSEN BRANAY
 */
public class Bank_project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bank icici=new bank();
        bank sbi=new bank();
        bank iob=new bank();
        icici.name="ICICI Bank";
        sbi.name="State Bank of India";
        iob.name="Indian Overseas Bank";
        icici.interest=7;
        sbi.interest=8;
        iob.interest=9;
        icici.grt_loan();
        sbi.grt_loan();
        iob.grt_loan();
        
        
    }
    
}
