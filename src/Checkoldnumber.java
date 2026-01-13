import java.util.Scanner;

public class Checkoldnumber {
    public static void main (String arg[]){
        Scanner sc = new Scanner( System.in);
        int number = sc. nextInt();
        if (number % 2 == 0){
            System.out.println("even");

        }else{
            System.out.println("odd");
        }
    }
}
