
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here. 
        System.out.println("Enter the first string:");
        String i = scan.nextLine();
        System.out.println("Enter the second string:");
        String o = scan.nextLine();
        if (i.equals(o)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
