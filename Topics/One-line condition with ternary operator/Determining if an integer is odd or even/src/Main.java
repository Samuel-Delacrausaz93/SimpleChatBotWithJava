import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the input number
        int number = scanner.nextInt();

        // Write a one-line condition using ternary operator to check if the number is even or odd
        boolean evenOrOdd = number % 2 == 0;
        String isEven = evenOrOdd ? "even" : "odd";
        // If the number is even, print "even"
        System.out.println(isEven);
        // Otherwise, print "odd"
    }
}