import java.util.Scanner;
interface iface
{
static final int x=10;
abstract void show();
}

class A implements iface
{
public void show()
{
System.out.println("VALUE OF X="+x);
}
}

class B
{
public static void main(String args[])
{
A obj=new A();
obj.show();
}
}