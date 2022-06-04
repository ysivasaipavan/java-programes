public class Rev {
    public static void main(String[] args) {
        int n=123456, reverse = 0, remainder;
      while(n!=0)
      {
        while (n != 0) {
            remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n /= 10;
            System.out.println(reverse);
          }
      }
    }
}
