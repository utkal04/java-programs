import java.util.Scanner;

class no1
{
    public static void main(String[] args) {
        String s[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        int x=a;
        String ns="";
        while(x>0)
        {
           int r=x%10;
           ns=" "+s[r]+" "+ns;
           x=x/10;
        }
        System.out.println(ns);

    }
}