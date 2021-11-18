
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
                System.out.println("Give the first number:");
        int i = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int o = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int u = Integer.valueOf(scanner.nextLine());
        System.out.println("The sum of the numbers is " + (i + o + u));

    }
}
