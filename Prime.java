public class Prime {
    public static void main(String[] args) {
        {
            int n=4, i, flag = 0;
            if (n == 0 || n == 1)
              flag = 1;
          
            for (i = 2; i <= n / 2; ++i) {
          
              if (n % i == 0) {
                flag = 1;
                break;
              }
            }
          
            if (flag == 0)
              System.out.println("Prime no");
            else
            System.out.print("NOT Prime no");
          } 
        }
    }
