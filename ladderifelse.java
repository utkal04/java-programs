import java.util.Scanner;
class f10
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER UR NO.");
int a=sc.nextInt();
if(a>0)
{
System.out.println("POSSITIVE NUMBER");
}
else if(a<0)
{
System.out.println("NEGATIVE NUMBER");
}
else
{
System.out.println("ITS A ZERO");
}
}
}