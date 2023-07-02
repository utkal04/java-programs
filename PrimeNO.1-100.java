import java.util.Scanner;
import java.lang.*;
class prime
{
    public static void main(String args[])
    {
      int i;
System.out.println("THE PRIME NUMBERS ARE:");
      for(i=1;i<=100;i++)
      {
          int c=0,j;
          for(j=1;j<=i;j++)
          {
              if(i%j==0)
              c++;
          }
          if(c==2)
          System.out.println(i);
      }
    }
}