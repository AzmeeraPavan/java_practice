import jdk.nashorn.internal.ir.SwitchNode;

import java.util.Scanner;

public class Calculater {
    public static void main (String arg[]){
        Scanner sc= new Scanner(System.in);
        int method =sc.nextInt();
        int number1 =sc.nextInt();
        int number2 =sc.nextInt();
        switch(method){
            case 1 : System.out.println(number1+number2);
                break;
            case 2 : System.out.println(number1-number2);
                break;

            case 3 : System.out.println(number1*number2);
                break;

            case 4 : System.out.println(number1%number2);
                break;


        }
    }
}
