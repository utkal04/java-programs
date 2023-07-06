import java.util.Scanner;
class f18
{
public static void main(String args[])
{
person obj1=new person();
ceo obj2=new ceo("utkal", 20);
obj2.salary();
}
}

class person
{
    String name ;int age;

    void work()
{
    System.out.println("works ");
}
void salary()
{
    System.out.println("Salary");
}
}

class ceo extends person
{
ceo(String name,int age)
{
    System.out.println(name+"  "+age);
}
}