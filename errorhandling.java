import java.util.Scanner;
class f8
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]={1,2,3,4};
System.out.println("ENTER THE POSITION U WANT TO GET:");
int x=sc.nextInt();
try{
System.out.println(a[x]);
}catch(Exception e)
{
System.out.println("U HAVE ENTERED A WRONG POSITION");
System.out.println(e.getLocalizedMessage());
}
System.out.println("HOPE U GOT UR RESULT");
}
}