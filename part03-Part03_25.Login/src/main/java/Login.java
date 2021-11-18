
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usersArray = {"alex", "emma"};
        String[] passArray = {"sunshine", "haskell"};

        System.out.println("Enter username: ");
        String userU = scanner.nextLine();
        System.out.println("Enter password: ");
        String userP = scanner.nextLine();

        boolean isValid = false;

        for (int i = 0; i < usersArray.length; i++) {
            if (usersArray[i].equals(userU) && passArray[i].equals(userP)) {
                isValid = true;
            }

        }
        if (isValid) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
