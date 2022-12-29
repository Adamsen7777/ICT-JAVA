
package innerclass;

public class Innerclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Company company = new Company();
        Company.Vehicle vehicle = company.new Vehicle ();
        
        
        vehicle.name();
        
//        System.out.println("company name:" + company.name);
//        System.out.println("vehicle type:" + vehicle.type);
//        
    }
    
}
