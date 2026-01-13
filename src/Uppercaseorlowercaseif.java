// code check uppercase or lower case

import java.util.Scanner;

public class Uppercaseorlowercaseif {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if ( ch >= 'A' && ch <= 'Z'){
            System.out.println("enter the Uppercase letter: "+ch);
        }else if(ch >= 'a' && ch <= 'z'){
            System.out.println("enter the Lowercase letter: "+ch);
        }else{
            System.out.println("enter the this is not alphabet: "+ch);
        }
    }
}
