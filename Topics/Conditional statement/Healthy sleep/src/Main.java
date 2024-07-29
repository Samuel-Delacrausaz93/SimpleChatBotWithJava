import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int sleepTimeMin = scanner.nextInt();
        int sleepTimeMax = scanner.nextInt();
        int sleepTimeAnn = scanner.nextInt();

        if (sleepTimeAnn >= sleepTimeMin && sleepTimeAnn <= sleepTimeMax) {
            System.out.println("Normal");
        } else if (sleepTimeAnn > sleepTimeMax) {
            System.out.println("Excess");
        } else {
            System.out.println("Deficiency");
        }
    }
}