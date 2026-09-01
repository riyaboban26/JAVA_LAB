import java.util.Scanner;

// Class to handle grade logic
class GradeCalculator {
    private int marks;

    // Method to read marks from the user
    public void readMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Marks: ");
        this.marks = scanner.nextInt();
        scanner.close();
    }

    // Method to determine and display the grade
    public void displayGrade() {
        char grade;

        if (marks >= 90 && marks <= 100) {
            grade = 'A';
        } else if (marks >= 80 && marks <= 89) {
            grade = 'B';
        } else if (marks >= 70 && marks <= 79) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        System.out.println("Grade = " + grade);

        
    }
}

// Main class to run the program
public class Grade {
    public static void main(String[] args) {
        GradeCalculator calculator = new GradeCalculator();
        
        calculator.readMarks();
        calculator.displayGrade();
    }
}
