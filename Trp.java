public class Trp {
    public static void main(String[] args) {
        {
            int a[][]={{1,2,3},{2,5,8},{7,8,9}};
            int i,j;
            {
                for(i=0;i<3;i++)
                {
                    for(j=0;j<3;j++)
                    System.out.print(a[i][j]+" ");
                }
                System.out.println(" ");                
                for(i=0;i<3;i++)
                {
                    for(j=0;j<3;j++)
                    System.out.print(a[j][i]+" ");
                }
            }
        }
    }
    
}
