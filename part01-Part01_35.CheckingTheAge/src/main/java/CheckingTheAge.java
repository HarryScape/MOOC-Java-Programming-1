
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How old are you? ");
        int a = scan.nextInt();
        if (a >= 0 && a <= 120) {
            System.out.println("Ok");
        } else {
            System.out.println("Impossible!");
        }

    }
}
