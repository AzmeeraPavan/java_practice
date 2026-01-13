import java.util.Scanner;

public class Vowelorconsonant {
    public static void main (String arg[]){
        System.out.print("Enter a character: ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        // Convert to lowercase to handle both uppercase & lowercase
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("you entered the ovel :"+ch);

        }else{
            System.out.println("you entered the is not ovel :"+ch);
        }
    }

}
