
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Last number?");
        int n = scan.nextInt();
        int r = 0;

        for (int i = 1; i <= n; i++) {
            r += i;
        }
        System.out.println("The sum is " + r);

    }
}
