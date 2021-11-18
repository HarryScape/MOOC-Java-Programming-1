
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        //int i = 0;
        int z;
        System.out.println("Where to? ");
        int s = scan.nextInt();
        System.out.println("Where from? ");
        int f = scan.nextInt();
        for (z = f; z <= s; z++) {
            System.out.println(z);
        }
    }
}
