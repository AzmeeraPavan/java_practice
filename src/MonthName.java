import java.util.Scanner;

public class MonthName {
    public static  void main(String arg[]){
        System.out.println("Enter a month");
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();
        if (month.equals( "jan")){
            System.out.println("Jan");
        }else if (month.equals("Feb")){
            System.out.println("Feb");
        } else if (month.equals("March")) {
            System.out.println("March");
        }else if (month.equals("April")) {
            System.out.println("April");
        }else if (month.equals("May")) {
            System.out.println("May");
        }else if (month.equals("Jun")) {
            System.out.println("Jun");
        }else if (month.equals("July")) {
            System.out.println("July");
        }else if (month.equals("August")) {
            System.out.println("August");
        }else if (month.equals("Septumber")) {
            System.out.println("Septumber");
        }else if (month.equals("Octomber")) {
            System.out.println("Octomber");
        }else if (month.equals("Nevmber")) {
            System.out.println("Nevmber");
        }else if (month.equals("Decmber")) {
            System.out.println("Decmber");
        } else {
            System.out.println("Invaild Input");
        }
    }
}
