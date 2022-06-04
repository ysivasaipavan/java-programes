public class Diam {
    public static void main(String[] args) {
        {
            int i,j,k;
                for(i=0;i<4;i++)
                {
                    for(j=0;j<40-2*i;j++)
                    {
                        System.out.print(" ");
                    }
                    for(k=0;k<=i;k++)
                    {
                        System.out.print("*");
                        System.out.print("    ");
                    }
                    System.out.print("\n");                    
                }
                for(i=4;i>=0;i--)
                {
                    for(j=0;j<40-2*i;j++)
                    {
                        System.out.print(" ");
                    }
                    for(k=0;k<=i;k++)
                    {
                        System.out.print("*");
                        System.out.print("    ");
                    }
                    System.out.print("\n");                    
                }

        }
    }
}
