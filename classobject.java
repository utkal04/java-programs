import java.util.Scanner;
class f12
{
public static void main(String args[])
{
person obj1=new person();
obj1.name="UTKAL";
obj1.age=20;
System.out.println(obj1.name+" "+obj1.age);
person obj2=new person();
obj2.name="KARAN";
obj2.age=22;
System.out.println(obj2.name+" "+obj2.age);
}
}
class person
{
String name;
int age;
}