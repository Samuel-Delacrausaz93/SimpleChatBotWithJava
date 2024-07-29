import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long product = 1L;

        for (long i = a; i < b; i++) {

            product = product * i;

        }
        System.out.println(product);
    }
}