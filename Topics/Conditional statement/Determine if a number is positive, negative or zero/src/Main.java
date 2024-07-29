import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a new Scanner object for reading the input
        Scanner scanner = new Scanner(System.in);

        // Read the number N
        int n = scanner.nextInt();

        // Your code goes here

        if (n > 0) {
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else if (n == 0) {
            System.out.println("Zero");
        }

        // Important: Remember to close the scanner!
        scanner.close();
    }
}
