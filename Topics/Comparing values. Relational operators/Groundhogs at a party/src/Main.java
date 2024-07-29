import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int peanutButterCups = scanner.nextInt();

        boolean isWeekend = scanner.nextBoolean();

        boolean partySuccessful = isWeekend  && peanutButterCups >= 15 && peanutButterCups <= 25 ||
                !isWeekend  && peanutButterCups >= 10 && peanutButterCups <= 20;

        System.out.println(partySuccessful);

    }
}