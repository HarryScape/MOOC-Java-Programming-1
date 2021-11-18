
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int count = 0;

        while (true) {
            String s = scan.nextLine();

            if (s.equals("end")) {
                break;
            }
            count++;
        }
        System.out.println(count);

    }
}
