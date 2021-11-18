
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number: ");
        int i = scan.nextInt();
        int n = 1;
        int f = 1;

        while (n <= i) {
            f *= n;
            n++;
        }

        System.out.println("Factorial: " + f);

    }
}
