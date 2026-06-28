import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        sc.close();

        if ((a % 2 )!= 0)
            System.out.print("Odd Number");
        else
            System.out.print("Even Number");
    }
}
 