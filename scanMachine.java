//this is a scanMachine class that stores details of scanning machines at a dental care facility.  


package Singleton;

public class scanMachine {
    
    static scanMachine object = new scanMachine();
    private int serialNo;
    private String brand;
    private String countryOfOrigin;
    private double cost;
    
    private scanMachine(){
        
    }
    
    public static scanMachine getobject(){
        return object;
    }
           
    public void viewdetailsofscanmachine(int s, String b, String o, double c){
        
        System.out.println("FDC Dental Scan Machine Details");
        System.out.println("Serial No: " + s);
        System.out.println("Brand: " + b);
        System.out.println("Origin: " + o);
        System.out.println("Cost: " + c);
    }
      
}
