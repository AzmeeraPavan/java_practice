import java.util.Scanner;

public class LargestThreeNumbers {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int A= sc.nextInt();
        int B= sc.nextInt();
        int C= sc.nextInt();
        if(A > B && A>C){
            System.out.println("A is the greater then B and C");
        } else  if (B > A && B>C){
            System.out.println("B is the greater then A and C");
        }else{
            System.out.println("C is the greater then A and B");
        }
    }
}
