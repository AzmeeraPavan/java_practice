import java.util.Scanner;

public class Greaterthan100 {
    public static void main( String arg[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 100){
            System.out.println(number+" :number more then 100");
        }else {
            System.out.println(number+" :number not more then 100");
        }
    }

}
