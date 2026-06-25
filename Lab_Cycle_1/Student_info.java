import java.util.Scanner;
public class Student_info {
    public static void main(String[] args) {

        Student s = new Student();

        s.readDetails();
        s.displayDetails();
    }
}

class Student {
    String name;
    int rollNo;
    String course;
    double percentage;

    void readDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        course = sc.nextLine();

        System.out.print("Enter Percentage: ");
        percentage = sc.nextDouble();

        sc.close();
    }

    void displayDetails() {
        System.out.println("\nStudent Details");
        System.out.println("---------------");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Course     : " + course);
        System.out.println("Percentage : " + percentage);
    }
}

