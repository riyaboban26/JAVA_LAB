package Lab_Cycle_2;

import java.util.Scanner;

class Box {
    int l, b, h;

    Box(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    int volume() {
        return l * b * h;
    }
}

class Demo {

    void larger(Box b1, Box b2) {
        System.out.println("Larger Box Volume = " + Math.max(b1.volume(), b2.volume()));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Box b1 = new Box(sc.nextInt(), sc.nextInt(), sc.nextInt());
        Box b2 = new Box(sc.nextInt(), sc.nextInt(), sc.nextInt());

        sc.close();

        Demo d = new Demo();
        d.larger(b1, b2);
    }
}