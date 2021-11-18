
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int i = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int o = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int z = Integer.valueOf(scanner.nextLine());
        double result = 1.0 * (i+o+z)/3;
        System.out.println("The average is " + result);

    }
}
