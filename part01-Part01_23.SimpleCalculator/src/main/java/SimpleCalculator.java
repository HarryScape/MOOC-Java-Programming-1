
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int i = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int o = Integer.valueOf(scanner.nextLine());
        int a = i+o;
        int b = i-o;
        int c = i*o;
        double d = (double) i/o;
               
        
        System.out.println(i + " + " + o + " = " + a);
        System.out.println(i + " - " + o + " = " + b);
        System.out.println(i + " * " + o + " = " + c);
        System.out.println(i + " / " + o + " = " + d);

    }
}
