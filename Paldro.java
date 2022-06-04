public class Paldro {
    public static void main(String[] args) {
        {
            int r=0,sum=0,n=125,temp;
            System.out.println(n);
            temp=n;
            while(n>0)
            {
                r=n%10;
                sum=(sum*10)+r;
                n=n/10;
            }
            if(temp==sum)
            {
                System.out.println("It was a palindrome numb");
            }
            else
            {
                System.out.println("It Was A Not a palindrome numb");

            }   
        }
    }
}
