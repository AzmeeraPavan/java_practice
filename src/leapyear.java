import java.util.Scanner;

public class leapyear {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int year=sc.nextInt();
        if (year % 4 ==0){
            System.out.println("is Leap year :"+year);
        }else {
            System.out.println("is not Leap year :" + year);
        }
    }


}
