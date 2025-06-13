// Program Title: Student Grader - Evaluate Grades Based on Marks

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int marks;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your marks (0 - 300): ");
        marks = scanner.nextInt();

        // Validate input
        if (marks < 0 || marks > 300) {
            System.out.println("Invalid input. Please enter marks between 0 and 300.");
        } else {
            // Grading logic
            if (marks > 250) {
                System.out.println("Grade: A+");
            } else if (marks > 200) {
                System.out.println("Grade: A");
            } else if (marks > 150) {
                System.out.println("Grade: B+");
            } else if (marks > 100) {
                System.out.println("Grade: B");
            } else {
                System.out.println("Grade: Failed");
            }
        }

        scanner.close();
    }
}