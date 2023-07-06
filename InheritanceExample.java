import java.util.Scanner;
class f19
{
public static void main(String args[])
{
ceo c1=new ceo("utkal",20);
ceo c2=new ceo("sahil",21);
c1.details();
c2.details();
}
}
class person
{
String name;int age;
public person(String name,int age)
{
this.name=name;
this.age=age;
}
void details()
{
System.out.println("DETAILS:"+name+" AGE:"+age);
}
}
class ceo extends person
{
public ceo(String name ,int age)
{
super(name,age);
}
}
