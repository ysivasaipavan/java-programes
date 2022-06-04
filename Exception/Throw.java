public class Throw {
    public static void main(String[] args) {
        {
            int a = 9, b = 9;
            if (a - b == 0) {
                throw new ArithmeticException("Invalid");
            }
        }
    }
}
