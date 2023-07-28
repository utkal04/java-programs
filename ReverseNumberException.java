import java.util.Scanner;

class revEXP
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        try{
            int rev=reverse(a);
            System.out.println("REVERSE NUMBER ="+rev);
        }
        catch(Exception e)
        {
            System.out.println(e.getLocalizedMessage());
        }
    }
    public static int reverse(int x) throws Exception
    {
       if(x<=0)
       {
        throw new Exception("NUMBER IS 0 OR NEGATIVE");
       }
       int r=0;int rev=0;
       while(x>0){
         r=x%10;
         rev=rev*10+r;
         x=x/10;
       }
       return rev;
    }
}