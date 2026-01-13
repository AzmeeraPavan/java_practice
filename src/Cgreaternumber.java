import java.util.Scanner;

public class Cgreaternumber {
    public static void main(String arg[]){
        Scanner sc= new Scanner (System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        if (number1 > number2){
            System.out.println("number1 more then number2  :"+ number1);
        }else if (number1 == number2){
            System.out.println("number1 and are equal number1   :"+ number1 +"=="+ number2);
        }else {
            System.out.println("number2 more then number1  :"+ number2);
        }
    }
}
