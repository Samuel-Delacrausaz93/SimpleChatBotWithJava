import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int howMuchGrades = scanner.nextInt();
        int gradeD = 0;
        int gradeC = 0;
        int gradeB = 0;
        int gradeA = 0;

        for (int i = 0; i <= howMuchGrades; i++) {
            String grade = scanner.nextLine();
            switch (grade) {
                case "D" -> gradeD += 1;
                case "C" -> gradeC += 1;
                case "B" -> gradeB += 1;
                case "A" -> gradeA += 1;
                default ->  { }
            }


        }
        System.out.printf("%d %d %d %d", gradeD, gradeC, gradeB, gradeA);

    }
}