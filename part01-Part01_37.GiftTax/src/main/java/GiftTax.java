
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        Double g = scan.nextDouble();
        Double t1 = (100 + (g-5000)*0.08);
        Double t2 = (1700 + (g-25000)*0.10);
        Double t3 = (4700 + (g-55000)*0.12);
        Double t4 = (22100 + (g-200000)*0.15);
        Double t5 = (142100 + (g-1000000)*0.17);
        
        if (g < 5000) {
            System.out.println("No tax!");
        } else if (g >= 5000 && g < 25000) {
            System.out.println("Tax: " + t1);
        } else if (g >=25000 && g < 55000) {
            System.out.println("Tax: " + t2);
        } else if (g >= 55000 && g < 200000) {
            System.out.println("Tax: " + t3);
        } else if (g >= 200000 && g < 1000000) {
            System.out.println("Tax: " + t4);
        } else if (g >= 1000000) {
            System.out.println("Tax: " + t5);
        }

    }
}
