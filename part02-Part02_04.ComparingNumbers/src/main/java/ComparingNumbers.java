
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        int o = scanner.nextInt();
        if (i > o) {
            System.out.println(i + " is greater than " + o);
        } else if (i < o) {
            System.out.println(i + " is smaller than " + o);
        } else if (i == o) {
            System.out.println(i + " is equal to " + o);
        }

    }
}
