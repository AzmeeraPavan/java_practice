
//Check whether a number is a multiple of 10.
import java.util.Scanner;

public class MultipleofTEN {
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 10 ==0){
            System.out.println("is multiple of: "+number);
        }else {
            System.out.println("is not multiple of: "+number);
        }
    }
}
