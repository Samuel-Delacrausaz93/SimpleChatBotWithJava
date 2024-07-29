import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int rangeFrom = scanner.nextInt();
        int rangeTo = scanner.nextInt();
        int sum = 0;

        for (int i = rangeFrom; i <= rangeTo; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}