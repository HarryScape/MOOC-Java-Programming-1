
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        ArrayList<String> nos = new ArrayList<>();
        int count = 0;

        try (Scanner read = new Scanner(Paths.get(file))) {
            while (read.hasNextLine()) {
                nos.add(read.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (String i : nos) {
            int number = Integer.valueOf(i);
            if (number >= lowerBound && number <= upperBound) {
                count++;
            }
        }
        System.out.println("Numbers: " + count);
    }

}
