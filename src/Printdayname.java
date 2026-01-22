import java.util.*;

public class Printdayname {
    public static void main(String arg[]){
        System.out.println("enter the day:");
        Scanner sc = new Scanner(System.in);
        String ch= sc.nextLine();
        if(ch.equals("Monday")){
            System.out.println("Monday");
        } else if (ch.equals("Tusday")){
            System.out.println("Tusday");
        } else if (ch.equals( "Wednesday")){
            System.out.println("Wednesday");
        } else if (ch.equals("Thussday")){
            System.out.println("Thussday");
        } else if (ch.equals("Friday")){
            System.out.println("Friday");
        }  else if (ch.equals( "Saturday")){
            System.out.println("Saturday");
        } else if (ch.equals("Sunday")){
            System.out.println("Sunday");
        }else {
            System.out.println("Invalid day intered ");
        }
    }
}
