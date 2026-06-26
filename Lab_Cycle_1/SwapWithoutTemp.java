import java.util.Scanner;

class Swap {

    int A;
    int B;

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A: ");
        A = sc.nextInt();

        System.out.print("Enter B: ");
        B = sc.nextInt();
    }

    void swapNumbers() {
        System.out.println("\nBefore Swap");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        // Swapping without temporary variable
        A = A + B;
        B = A - B;
        A = A - B;

        System.out.println("\nAfter Swap");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }
}

public class SwapWithoutTemp {

    public static void main(String[] args) {

        Swap obj = new Swap();

        obj.getData();
        obj.swapNumbers();
    }
}