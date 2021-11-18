
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String s = scanner.nextLine();
            if (s.equals("")) {
                break;
            }

            String[] split = s.split(" ");
            int i = split.length - 1;
            System.out.println(split[i]);
        }
    }
}
