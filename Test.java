//this is the main method class

package Singleton;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Serial Number: ");
        int serial = sc.nextInt();
        
        sc.nextLine();
        
        System.out.println("Brand: ");
        String brand = sc.nextLine();
        
        System.out.println("Country of origin: ");
        String origin = sc.nextLine();
        
        System.out.println("Cost: ");
        double amount = sc.nextDouble();
        sc.close();
        
        scanMachine scan = scanMachine.getobject();
        scan.viewdetailsofscanmachine(serial, brand, origin, amount);
        
    }
    
}
