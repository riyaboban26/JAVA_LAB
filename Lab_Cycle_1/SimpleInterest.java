import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        interestCalculator ic = new interestCalculator();

        ic.getData();
        ic.calculateInterest();
        ic.displayInterest();

    }
}

class interestCalculator {
    double principal;
    double rate;
    double time;
    double simpleInterest;
    double totalAmount;

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        time = sc.nextDouble();

        sc.close();
    }

    void calculateInterest() {
        simpleInterest = (principal * rate * time) / 100;
        totalAmount = principal + simpleInterest;
    }

    void displayInterest() {
        System.out.println("\nSimple Interest Calculation");
        System.out.println("---------------------------");
        System.out.println("Principal Amount : " + principal);
        System.out.println("Rate of Interest : " + rate + "%");
        System.out.println("Time (in years)  : " + time);
        System.out.println("Simple Interest  : " + simpleInterest);
        System.out.println("Total Amount     : " + totalAmount);
    }
}
