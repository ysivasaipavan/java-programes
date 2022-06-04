public class TryCatch {
    public static void main(String[] args) {
        int a = 10, b = 0, c;
        System.out.println(a + b);
        try {
            c = a / b;
            System.out.println(c);

        } catch (ArithmeticException e) {
            System.out.println("it was error number" + e);
        }
        System.out.println(a * b);
    }
}
