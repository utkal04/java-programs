import java.util.Scanner;
class f7
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c;
double per;
String name[]=new String[3];
System.out.println("ENTER THE NAMES OF STUDENTS");
for(int i=0;i<3;i++)
{
name[i]=sc.nextLine();
}
for(int i=0;i<3;i++)
{
System.out.println("ENTER THE MARKS OF "+name[i]);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
per=percentage(a,b,c);
System.out.println("PERCENTAGE OF "+name[i]+"="+per);
}
}
static double percentage(int x,int y,int z)
{
double s=x+y+z;
double p;
p=(s/300)*100;
return p;
}
}
