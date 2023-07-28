import java.util.Scanner;

class factEXP
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        try{
            int fact=factorial(a);
            System.out.println("FACTORIAL ="+fact);
        }
        catch(Exception e)
        {
            System.out.println(e.getLocalizedMessage());
        }
    }
    public static int factorial(int x) throws Exception
    {
       if(x==0)
       {
        throw new Exception("NUMBER IS 0 TRY WITH A NON ZERO NUMBER");
       }
      int f=1;
      for(int i=1;i<=x;i++){
         f=f*i;
      }
       return f;
    }
}