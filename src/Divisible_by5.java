import java.util.Scanner;

public class Divisible_by5 {
    public static void  main (String arg[]){
        Scanner sc = new Scanner(System.in);
        int number =sc.nextInt();
        if (number % 5 == 0){
            System.out.println(number+":  number is divided by 5 ");
        }else{
            System.out.println(number+":  number is not divided by 5 ");
        }
    }
}
