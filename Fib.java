public class Fib {
    public static void main(String[] args) {
        {
            int i,a=0,b=1,c=0;
            for(i=0;i<10;i++)
            {
                System.out.println(a);
                c=a+b;
                a=b;
                b=c;
            }
        }
    }
}
