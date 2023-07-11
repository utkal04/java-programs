import java.util.Scanner;
class Abstraction
{
public static void main(String args[])
{
xuv x1=new xuv();
x1.intro();
}
}

abstract class car
{
int price;
abstract void intro();
}

class xuv extends car
{
void intro()
{
System.out.println("XUV");
}
}

class bolero extends car
{
void intro()
{
System.out.println("BOLERO");
}
}

