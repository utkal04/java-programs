import java.util.Scanner;
class f15
{
public static void main(String args[])
{
person obj1=new person();
obj1.name="utkal";
obj1.age=20;

person obj2=new person();
obj2.name="ujjal";
obj2.age=15;

obj1.run();
obj2.run();

System.out.println(person.count);
}
}

class person
{
String name;int age;
static int count;
person()
{
count++;
}
void run()
{
System.out.println(name+"  is running");
}

}