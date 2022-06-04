public class Due
{
    public static void main(String[] args) {
        int a[]={2,2,3,2,4,4,5,5,6,6,7,7};
        int n=10,i,j,k;
        {
            for(i=0;i<n;i++)
            {
                for(j=i+1;j<n;j++)
                {
                    if(a[i]==a[j])
                    {
                        for(k=j;k<n-1;k++)
                        {
                            a[k]=a[k+1];
                        }
                        n--;
                        j--;
                    }
                }
                for(i=0;i<n;i++)
            System.out.println(i);
            }
            
        }
    }
}