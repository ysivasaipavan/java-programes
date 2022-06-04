public class Linear {
    public static void main(String[] args) {
        int a[]={1,2,3,5,5,8,7,9};
        int i,key=10,cont=0;
        for(i=0;i<8;i++)
        {
            if(a[i]==key)
            {
                cont ++;
            }
        }
        if(cont==1)
        {
            System.out.println("Element found");
        }
        else
        {
            System.out.println("Element NOT FOUND");
        }
    }
}
