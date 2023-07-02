import java.util.Scanner;
import java.lang.*;
class binary
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no");
        int a=sc.nextInt();
        int b=a;
        System.out.println("the binary form of "+a);
        while(b>0)
        {
            int p=b%2;
            System.out.print(p);
            b/=2;
        }
    }
}