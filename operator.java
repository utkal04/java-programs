import java.util.Scanner;
class f2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

//ARITHMATIC OPERATORS +,-,*,/,%,++,--
System.out.println("ENTER 2 NOS");
int a=sc.nextInt();
int b=sc.nextInt();
int sum=a+b;
int diff=a-b;
int mul=a*b;
double div=a/b;
int r=a%b;
int a1=++a;
int a2=--b;
System.out.println("SUM="+sum);
System.out.println("DIFFERENCE="+diff);
System.out.println("PRODUCT="+mul);
System.out.println("DIVISION="+div);
System.out.println("MODULUS="+r);
System.out.println("INCREMENT OF A="+a1);
System.out.println("DECREMENT OF B="+a2);

//LOGICAL OPERATOR >,<,==,<=,>=,!=
System.out.println("ENTER NOS FOR COMPARISON >");
int x=sc.nextInt();
int y=sc.nextInt();
System.out.println("GREATER THAN:"+(x>y));
System.out.println("ENTER NOS FOR COMPARISON <");
int x1=sc.nextInt();
int y1=sc.nextInt();
System.out.println("SMALLER THAN:"+(x1<y1));
System.out.println("ENTER NOS FOR COMPARISON ==");
int x2=sc.nextInt();
int y2=sc.nextInt();
System.out.println("EQUALS TO:"+(x2==y2));
System.out.println("ENTER NOS FOR COMPARISON >=");
int x3=sc.nextInt();
int y3=sc.nextInt();
System.out.println("GREATER THAN EQUALS TO:"+(x3>=y3));
System.out.println("ENTER NOS FOR COMPARISON <=");
int x4=sc.nextInt();
int y4=sc.nextInt();
System.out.println("SMALLER THAN EQUALS TO:"+(x4<=y4));
System.out.println("ENTER NOS FOR COMPARISON !=");
int x5=sc.nextInt();
int y5=sc.nextInt();
System.out.println("NOT EQUALS TO:"+(x5!=y5));

}
}


