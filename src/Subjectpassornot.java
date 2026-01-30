import java.util.Scanner;

public class Subjectpassornot {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Telugu Marks:");
        int T= sc.nextInt();
        System.out.println("Enter Hindi Marks:");
        int H= sc.nextInt();
        System.out.println("Enter English Marks:");
        int E= sc.nextInt();
        System.out.println("Enter Maths Marks:");
        int M= sc.nextInt();
        System.out.println("Enter Physicis Marks:");
        int P= sc.nextInt();
        System.out.println("Enter Biology Marks:");
        int B= sc.nextInt();
        System.out.println("Enter Social Marks:");
        int S= sc.nextInt();
        int total_marks= T+H+E+M+P+B+S;
        if ((T>= 35 && T <=100) && (H>= 35 && H <=100) &&(E>= 35 && E <=100) && (M>= 35 && M<=100) && (P>= 18 && P<=50)&&(B>= 18 && B<=5078) &&(S>= 35 && S<=100)){
            System.out.println("Student is passed with: "+total_marks+": Marks");
        }else {
            System.out.println("Student is failed with: "+total_marks+": Marks");
        }
    }
}
