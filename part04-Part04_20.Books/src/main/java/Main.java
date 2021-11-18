
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> library = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Title: ");
            String name = scan.nextLine();
            
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.valueOf(scan.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scan.nextLine());

            library.add(new Book(name, pages, year));
        }

        System.out.println("What information will be printed? ");
        String ans = scan.nextLine();

        for (Book i : library) {
            if (ans.equals("everything")) {
                System.out.println(i);
            } else if (ans.equals("name")) {
                System.out.println(i.getName());
            }
        }
    }
}
