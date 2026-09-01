// Task 1 - University Evaluation System
// Demonstration of Abstract Class and Abstract Methods

// ================= ABSTRACT CLASS =================
abstract class StudentEvaluation {
    protected int studentId;
    protected String studentName;
    // Constructor
    public StudentEvaluation(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }
    // Concrete Method
    public void displayStudentDetails() {
        System.out.println("-----------------------------------------");
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
    }
    // Abstract Methods
    public abstract int calculateTotalMarks();
    public abstract void displayGrade();
}
// ================= UG COURSE =================
class UGCourseEvaluation extends StudentEvaluation {
    private int internalMarks;
    private int externalMarks;
    private int total;
    public UGCourseEvaluation(int id, String name, int internalMarks, int externalMarks) {
        super(id, name);
        this.internalMarks = internalMarks;
        this.externalMarks = externalMarks;
    }
    @Override
    public int calculateTotalMarks() {
        total = internalMarks + externalMarks;
        System.out.println("Course       : UG");
        System.out.println("Total Marks  : " + total);
        return total;
    }
    @Override
    public void displayGrade() {
        if (total >= 90)
            System.out.println("Grade        : A+");
        else if (total >= 80)
            System.out.println("Grade        : A");
        else if (total >= 70)
            System.out.println("Grade        : B");
        else if (total >= 60)
            System.out.println("Grade        : C");
        else if (total >= 50)
            System.out.println("Grade        : D");
        else
            System.out.println("Grade        : F");
    }
}
// ================= PG COURSE =================
class PGCourseEvaluation extends StudentEvaluation {
    private int assignment;
    private int seminar;
    private int exam;
    private int total;
    public PGCourseEvaluation(int id, String name, int assignment, int seminar, int exam) {
        super(id, name);
        this.assignment = assignment;
        this.seminar = seminar;
        this.exam = exam;
    }
    @Override
    public int calculateTotalMarks() {
        total = assignment + seminar + exam;
        System.out.println("Course       : PG");
        System.out.println("Total Marks  : " + total);
        return total;
    }
    @Override
    public void displayGrade() {
        if (total >= 90)
            System.out.println("Grade        : Distinction");
        else if (total >= 75)
            System.out.println("Grade        : First Class");
        else if (total >= 60)
            System.out.println("Grade        : Second Class");
        else if (total >= 50)
            System.out.println("Grade        : Pass");
        else
            System.out.println("Grade        : Fail");
    }
}
// ================= CERTIFICATE COURSE =================
class CertificateCourseEvaluation extends StudentEvaluation {
    private int theory;
    private int practical;
    private int total;
    public CertificateCourseEvaluation(int id, String name, int theory, int practical) {
        super(id, name);
        this.theory = theory;
        this.practical = practical;
    }
    @Override
    public int calculateTotalMarks() {
        total = theory + practical;
        System.out.println("Course       : Certificate");
        System.out.println("Total Marks  : " + total);
        return total;
    }
    @Override
    public void displayGrade() {
        if (total >= 85)
            System.out.println("Grade        : Excellent");
        else if (total >= 70)
            System.out.println("Grade        : Very Good");
        else if (total >= 55)
            System.out.println("Grade        : Good");
        else if (total >= 40)
            System.out.println("Grade        : Satisfactory");
        else
            System.out.println("Grade        : Not Qualified");
    }
}
// ================= NEW COURSE =================
class DiplomaCourseEvaluation extends StudentEvaluation {
    private int project;
    private int viva;
    private int total;
    public DiplomaCourseEvaluation(int id, String name, int project, int viva) {
        super(id, name);
        this.project = project;
        this.viva = viva;
    }
    @Override
    public int calculateTotalMarks() {
        total = project + viva;
        System.out.println("Course       : Diploma");
        System.out.println("Total Marks  : " + total);
        return total;
    }
    @Override
    public void displayGrade() {
        if (total >= 90)
            System.out.println("Grade        : Outstanding");
        else if (total >= 75)
            System.out.println("Grade        : Excellent");
        else if (total >= 60)
            System.out.println("Grade        : Good");
        else if (total >= 50)
            System.out.println("Grade        : Average");
        else
            System.out.println("Grade        : Fail");
    }
}
// ================= MAIN CLASS =================
public class Main {
    public static void main(String[] args) {
        StudentEvaluation students[] = {
                new UGCourseEvaluation(101, "Akhil", 35, 55),
                new PGCourseEvaluation(102, "Sneha", 18, 19, 55),
                new CertificateCourseEvaluation(103, "Rahul", 42, 45),
                new UGCourseEvaluation(104, "Meera", 38, 58),
                new DiplomaCourseEvaluation(105, "Anjali", 47, 48)
        };
        System.out.println("==============================================");
        System.out.println("     UNIVERSITY EVALUATION SYSTEM");
        System.out.println("==============================================");
        for (StudentEvaluation student : students) {
            student.displayStudentDetails();
            student.calculateTotalMarks();
            student.displayGrade();
            System.out.println();
        }

        System.out.println("Evaluation Completed Successfully.");
    }
}