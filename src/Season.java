import java.security.PublicKey;
import java.util.Scanner;

public class Season {
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        String session= sc.nextLine();
        if(session.equals("F")){
            System.out.println("1st Session");
        } else if (session.equals("M")) {
            System.out.println("2nd Session");
        }else if (session.equals("L")) {
            System.out.println("3rdSession");
        }else {
            System.out.println("invalid input");
        }

    }
}
