
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number:");
        int i = scan.nextInt();
        System.out.println("Give the second number:");
        int o = scan.nextInt();
        if (i > o) {
            System.out.println("Greater number is: " + i);
        } else if (o > i) {
            System.out.println("Greater number is: " + o);
        } else if (i == o) {
            System.out.println("The numbers are equal!");
        }

    }
}
