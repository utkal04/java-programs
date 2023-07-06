import java.util.Scanner;
class f14
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
obj1.study();
obj2.walk();
obj1.walk(2234);
obj2.walk(1923);
}
}


class person
{
String name;
int age;
void study()
{
System.out.println(name+" is a good student");
}
void walk()
{
System.out.println(name+" is walking");
}
void walk(int steps)
{
System.out.println(name+" walks "+steps+" steps");
}
}