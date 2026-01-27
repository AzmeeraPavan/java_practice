

// formula: (Usage in kWh × Rate per kWh) + Fixed Charges + Taxes = Total Bill

import java.util.Scanner;

public class ElectricBillGeneration {
    public static void main(String arg[]){
        System.out.println("Enter The Details");
        Scanner sc= new Scanner(System.in);
        System.out.println("kWh: ");
        int kWh =sc.nextInt();
        System.out.println("ratekWh: ");
        int ratekWh =sc.nextInt();
        System.out.println("fixed: ");
        int fixed=sc.nextInt();
        System.out.println("taxe: ");
        int taxe = sc.nextInt();
        int usage=(kWh*ratekWh+fixed+taxe);
        System.out.println("==========================================");
        System.out.println("Total Amount of Bill: "+usage);
        System.out.println("==========================================");
    }
}
