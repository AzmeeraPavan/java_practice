import java.awt.*;
import java.util.*;

public class ButtonInput {
    public  static  void main (String args []){
        Scanner sc= new Scanner(System.in);
        int Button = sc.nextInt();
//        if (Button == 1){
//            System.out.println("you enter     :"+ Button);
//        }else if(Button == 2){
//            System.out.println(("you enter     :"+ Button));
//        }else if(Button == 3){
//            System.out.println(("you enter     :"+ Button));
//        }else {
//            System.out.println("you enter the other number      :"+Button );
//        }


        switch(Button){
            case 1 :System.out.println("hello");
            break;
            case 2 :System.out.println("Nameste");
            break;
            case 3 :System.out.println("Pavan");
            break;
            default:System.out.println("Invalid Buttom");
        }
    }
}
