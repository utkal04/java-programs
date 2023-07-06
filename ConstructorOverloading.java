import java.util.Scanner;
class f17
{
public static void main(String args[])
{
person obj=new person("utkal");
obj.person(20,"dsm");
}
}
class person
{
String name,department;
int age;
person(String n)
{
name=n;
System.out.println("STUDENT="+name);
}
void person(int a,String d)
{
age=a;department=d;
System.out.println(name+" details are:");
System.out.println("Age:"+age+"  Department:"+department);
}
}