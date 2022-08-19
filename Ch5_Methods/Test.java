public class Test {
    public void print(byte x) {
        System.out.print("byte ");
    }

    public void print(int x) {
        System.out.print("int ");
    }

    public void print(float x) {
        System.out.print("float ");
    }

    public void print(Object x) {
        System.out.print("object ");
    }

    public static void main(String[] args) {
        Test t = new Test();
        short s = 321;

        t.print(s); // int (larger primitive type)
        t.print(true); // object (autoboxing to Boolean)
        t.print(3.14); // object (autoboxing to Double)
    }
}