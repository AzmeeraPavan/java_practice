import java.util.Scanner;

public class Positiveornegative {
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        if (number >= 0){
            System.out.println(number+": is positive number");
        }else{
            System.out.println(number+": is nigitive  number");
        }
    }
}
