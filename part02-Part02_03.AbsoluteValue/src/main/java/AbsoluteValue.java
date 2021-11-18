
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int i = scanner.nextInt();
        int o = (i * -1);
        if (i < 0) {
            System.out.println(o);
        } else {
            System.out.println(i);
        }

    }
}
