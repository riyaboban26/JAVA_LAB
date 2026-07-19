package Lab_Cycle_2;

import java.util.Scanner;

class Area {

    int area(int side) {
        return side * side;
    }

    int area(int l, int b) {
        return l * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Side: ");
        int side = sc.nextInt();

        System.out.print("Length: ");
        int l = sc.nextInt();

        System.out.print("Breadth: ");
        int b = sc.nextInt();

        Area a = new Area();

        System.out.println("Area of Square = " + a.area(side));
        System.out.println("Area of Rectangle = " + a.area(l, b));
    }
}