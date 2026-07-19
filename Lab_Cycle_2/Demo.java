package Lab_Cycle_2;

class Demo {

    Demo() {
        System.out.println("Object Created");
    }

    protected void finalize() {
        System.out.println("finalize() method called");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d = null;
        System.gc();
    }
}
