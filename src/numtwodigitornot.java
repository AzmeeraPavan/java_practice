import java.util.Scanner;

public class numtwodigitornot {
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        int digit =sc.nextInt();
        if (digit>=10 &&  digit<=99){
            System.out.println("is Two Digit :"+digit);
        }else {
            System.out.println("is not Two Digit :"+digit);
        }
    }
}
