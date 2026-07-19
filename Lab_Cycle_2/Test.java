package Lab_Cycle_2;

class Test {

    Test() {
        System.out.println("Object Created");
    }

    protected void finalize() {
        System.out.println("Object Destroyed");
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();

        t1 = null;
        t2 = null;

        System.gc();
        System.out.println("Garbage Collection Requested");
    }
}