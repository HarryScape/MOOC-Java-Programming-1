
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("First number?");
        int n = scan.nextInt();
        System.out.println("Last number?");
        int m = scan.nextInt();
        int r = 0;

        for (int i = n; i <= m; i++) {
            r += i;
        }
        System.out.println("The sum is " + r);

    }
}
