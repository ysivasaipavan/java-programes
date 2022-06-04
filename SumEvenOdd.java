public class SumEvenOdd {
    public static void main(String[] args) {
        {
           int i,j=0,sum=0,a=5,rej=0;
            {
                for(i=1;i<a;i++)
                if(i%2==0)
                {
                    sum=sum+i;
                    System.out.println(sum);
                }
                else
                {
                    for(j=0;j<a;j++)
                    {
                        if(j%2!=0)
                        rej=rej+j;
                        System.out.println(rej);

                    }
                }
            }
        }
    }
}
