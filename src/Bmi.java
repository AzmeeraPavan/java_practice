import java.util.Scanner;

public class Bmi {
    public static void main(String arg[]){
        System.out.println("BMI");
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("BMI: "+bmi);
    }
}
