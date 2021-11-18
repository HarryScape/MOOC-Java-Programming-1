
public class Averaging {

    // implement the sum method here again
    public static int sum(int a, int b, int c, int d) {
        // write some code here
        int som = a + b + c + d;
        return som;
    }

    public static double average(int a, int b, int c, int d) {
        //write some code here
        double avg = 1.0 * sum(a,b,c,d) / 4;
        return avg;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
