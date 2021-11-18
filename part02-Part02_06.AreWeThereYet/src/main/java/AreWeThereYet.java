
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.println("Give a number:");
            int i = scan.nextInt();
            if (i == 4) {
                break;
            }
        }

    }
}
