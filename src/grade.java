import java.util.Scanner;

public class grade {
    public static void  main( String arg[]){
        System.out.println("enter the marks");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if (marks > 90 ){
            System.out.println("A grade");
        } else if(marks >= 75 && marks <=89 ){
            System.out.println("B grade");
        } else if(marks >= 60 && marks <=74 ){
            System.out.println("C grade");
        } else if( marks <=60 ){
            System.out.println("D grade");
        }
    }
}
