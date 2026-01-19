import java.util.Scanner;

public class passorfail {
    public static  void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if (marks >= 35){
            System.out.println("pass: "+marks);
        }else{
            System.out.println("fail: "+marks);
        }
    }
}
