public class NestedTry {
    public static void main(String[] args) {
        {
            int f = 25, b = 0, c, d = 10, h;
            try {
                c = f / b;
                try {
                    h = d / b;
                } catch (ArithmeticException e) {

                }
            } catch (ArithmeticException e) {
                System.out.println("Nested Try is working");
            }
        }
    }
}
