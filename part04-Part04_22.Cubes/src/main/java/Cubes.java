
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String s = scan.nextLine();

            if (s.equals("end")) {
                break;
            }
            int no = Integer.valueOf(s);
            System.out.println(no * no * no);
        }

    }
}
