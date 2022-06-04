public class PrimeReg {
    public static void main(String[] args) {
        {
            int num1=2, num2=10, flag_var, i, j;
    System.out.println( num1 );
    System.out.println( num2 );
    

   for(i=num1+1; i<num2; ++i)
   {
      flag_var=0;
      for(j=2; j<=i/2; ++j)
      {
         if(i%j==0)
         {
            flag_var=1;
            break;
         }
      }
      if(flag_var==0)
         System.out.println(i);
  }
}
        }
}