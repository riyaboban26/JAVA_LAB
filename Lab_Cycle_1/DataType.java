class DataTypeDemo {

    byte b = 100;
    short s = 1000;
    int i = 100;
    long l = 100000;
    float f = 25.5f;
    double d = 123.456;
    char c = 'A';
    boolean bool = true;

    void display() {

        System.out.println("Byte value      : " + b);
        System.out.println("Short value     : " + s);
        System.out.println("Integer value   : " + i);
        System.out.println("Long value      : " + l);
        System.out.println("Float value     : " + f);
        System.out.println("Double value    : " + d);
        System.out.println("Character       : " + c);
        System.out.println("Boolean         : " + bool);

        System.out.println("\nMemory Size of Data Types");
        System.out.println("byte    : " + Byte.BYTES + " bytes");
        System.out.println("short   : " + Short.BYTES + " bytes");
        System.out.println("int     : " + Integer.BYTES + " bytes");
        System.out.println("long    : " + Long.BYTES + " bytes");
        System.out.println("float   : " + Float.BYTES + " bytes");
        System.out.println("double  : " + Double.BYTES + " bytes");
        System.out.println("char    : " + Character.BYTES + " bytes");
        System.out.println("boolean : JVM dependent (typically 1 byte)");
    }
}

public class DataType {

    public static void main(String[] args) {

        DataTypeDemo obj = new DataTypeDemo();
        obj.display();
    }
}
