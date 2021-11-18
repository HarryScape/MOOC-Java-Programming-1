
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int o = 0;

        while (true) {
            System.out.println("Give a number:");
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            if (n != 0) {
                i = i + n;   
                o++;
            }
        }
        System.out.println("Number of numbers: " + o);
        System.out.println("Sum of the numbers: " + i);

    }
}
