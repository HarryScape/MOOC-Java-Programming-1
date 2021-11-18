
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int i = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int o = Integer.valueOf(scanner.nextLine());
        double result = 1.0 * (i+o)/2;
        System.out.println("The average is " + result);

    }
}
