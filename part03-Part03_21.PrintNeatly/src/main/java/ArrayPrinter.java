
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {

        for (int i = 0; i < array.length; i++) {  //  cant use nested loop as has two subs: print and if
            System.out.print(array[i]);           // 1.) print the element
            if (i != array.length - 1) {          // 2.) if it isn't the last number in the array then....
                System.out.print(",");            // 3.) print out a comma and space.
            }


        }
    }
}