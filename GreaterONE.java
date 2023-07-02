import java.util.*;
import java.lang.*;
class greater
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a num");
        int a=sc.nextInt();
        System.out.println("enter a num");
        int b=sc.nextInt();
        if(a>b)
        System.out.println(a+" is greater "+b+" is smaller ");
        else
        System.out.println(b+" this is greater "+a+" is smaller");
    }
}
