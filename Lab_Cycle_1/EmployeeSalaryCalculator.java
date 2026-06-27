import java.util.Scanner;

class Employee {

    double basicSalary, da, hra, grossSalary;

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();

        sc.close();
    }

    void calculateSalary() {
        da = basicSalary * 0.10;
        hra = basicSalary * 0.15;
        grossSalary = basicSalary + da + hra;
    }

    void display() {
        System.out.println("\nDA = " + da);
        System.out.println("HRA = " + hra);
        System.out.println("Gross Salary = " + grossSalary);
    }
}

public class EmployeeSalaryCalculator {

    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.getData();
        emp.calculateSalary();
        emp.display();
    }
}