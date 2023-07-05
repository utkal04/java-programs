import java.util.*;
import java.lang.*;
class switchcase
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a choice 1-PRIME 2-PALLINDROME 3-ARMSTRONG");
      int choice=sc.nextInt();
      switch(choice)
      {
          case 1:
 System.out.println("enter a no");
      int a1=sc.nextInt();
              int c=0;
              for(int i=1;i<=a1;i++)
              {
                  if(a1%i==0)
                  c++;
              }
              if(c==2)
              System.out.println(a1+"is a prime no");
              else
               System.out.println("not a prime no");
              break;
           case 2:
 System.out.println("enter a no");
      int a2=sc.nextInt();
               int rev=0,b=a2,r;
               while(b>0)
               {
                   r=b%10;
                   rev=rev*10+r;
                   b/=10;
               }
               if(rev==a2)
                System.out.println(a2+"is a pallindrome no");
                else
                 System.out.println("sry not a pallindrome no");
                break;
           case 3:
 System.out.println("enter a no");
      int a3=sc.nextInt();
               int arm=0,x=0,y=a3;
               while(y>0)
               {
                   x=y%10;
                   arm=arm+(x*x*x);
                   y=y/10;
                }
                if(arm==a3)
                 System.out.println(a3+"is armstrong");
                 else
                  System.out.println("no armstrong");
                   break;
           default:
            System.out.println("wrong choice");
               }
               
        

          
      }


    }
