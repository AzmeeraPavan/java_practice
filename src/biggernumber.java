import java.util.Scanner;

public class biggernumber {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int number1 = sc. nextInt();
        int number2 = sc. nextInt();
        if (number1 > number2){
            System.out.println("number1 :"+ number1);
        }else if(number1 == number2){
            System.out.println("number1" +"and"+"number2    :"+ number2+ "="+ number1);
        }else {
            System.out.println(" number1 is lesser "+number1);
        }
    }
}
