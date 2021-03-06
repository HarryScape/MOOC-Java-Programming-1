
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int nu = 0;
        System.out.println("Write numbers: ");

        while (true) {
            int n = Integer.valueOf(scan.nextLine());
            if (n == -1) {
                break;
            }

            sum += n;
            nu++;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + nu);

    }
}
