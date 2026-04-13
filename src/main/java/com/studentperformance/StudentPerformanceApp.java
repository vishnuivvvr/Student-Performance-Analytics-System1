import java.util.Scanner;

public class StudentPerformanceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] students = new String[5];
        int[] marks = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            students[i] = scanner.nextLine();

            int mark;
            while (true) {
                System.out.print("Enter marks for " + students[i] + " (0-100): ");
                mark = scanner.nextInt();
                if (mark >= 0 && mark <= 100) {
                    marks[i] = mark;
                    break;
                } else {
                    System.out.println("Invalid mark. Please enter a value between 0 and 100.");
                }
            }
            scanner.nextLine(); // clear buffer
        }

        System.out.println("\nPerformance report:");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nStudent: " + students[i] + " | Marks: " + marks[i] + " | Status: " + (marks[i] >= 50 ? "Pass" : "Fail"));
        }
        scanner.close();
    }
}