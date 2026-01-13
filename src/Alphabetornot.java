import java.util.*;

public class Alphabetornot {
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println(ch + " is an Alphabet");
        } else {
            System.out.println(ch + " is NOT an Alphabet");
        }
    }
}
