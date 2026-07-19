package Lab_Cycle_2;

import java.util.Scanner;

class Temperature {

    static double convert(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Celsius: ");
        double c = sc.nextDouble();

        sc.close();

        System.out.println("Fahrenheit = " + convert(c));
    }
}
