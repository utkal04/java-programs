import java.util.Scanner;
import java.lang.*;
class digit
{
   public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter a number");
         int a=sc.nextInt();
         int b=a,extract,min=a%10;
         while(b>0)
         {
            extract=b%10;
            if(extract<min)
            min=extract;
            b=b/10;
         }
          System.out.println("smallest digit in "+a+" is : "+min);
}
}