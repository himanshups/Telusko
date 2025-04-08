public class TypeCasting {
    public static void main(String[] args) {
        byte num1 = 126;
        int a = 12;
        num1 = (byte) a;

        float num2 = 18.34f;
        int b = (int) num2; // Explicit type casting from float to int;
        System.out.println(b); // 12.34 will be converted to 12;

        // type promotion in Java
        byte a = 123;
        byte b = 127;
        int result = a+b;
        System.out.println(num1);
    }
}
