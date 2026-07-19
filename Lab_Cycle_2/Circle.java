package Lab_Cycle_2;

import java.util.Scanner;

class Circle {

    final double PI = 3.14159;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();

        System.out.print("Radius: ");
        double r = sc.nextDouble();

        sc.close();

        double area = c.PI * r * r;

        System.out.printf("Area = %.2f", area);
    }
}