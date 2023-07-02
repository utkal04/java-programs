import java.util.Scanner;
class f6
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the no. of rows");
int r=sc.nextInt();
System.out.println("enter the no. of coloumn");
int c=sc.nextInt();
int a[][]=new int[r][c];
System.out.println("enter the values");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("THE MATRIX:");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print(a[i][j]+"    ");
}
System.out.println();
}
}
}