package Lab_Cycle_2;

class Display {

    void display(int a) {
        System.out.println("Integer : " + a);
    }

    void display(double b) {
        System.out.println("Double : " + b);
    }

    void display(String s) {
        System.out.println("String : " + s);
    }

    public static void main(String[] args) {
        Display d = new Display();

        d.display(10);
        d.display(25.6);
        d.display("Java");
    }
}