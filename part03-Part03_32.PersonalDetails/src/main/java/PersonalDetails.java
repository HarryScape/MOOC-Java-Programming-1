
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = 0;
        String name = "";
        String longName = "";
        int sum = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] data = input.split(",");
            name = data[0];
            if (name.length() > longName.length()) {
                longName = name;
            }
            for (String e : data) {
                sum = sum + Integer.valueOf(data[1]);
                count++;
            }

        }
        double average = (1.0 * sum / count);
        System.out.println("Longest name: " + longName);
        System.out.println("Average of the birth years: " + average);
    }

}


