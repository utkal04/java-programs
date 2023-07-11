import java.util.Scanner;
public class encapsulation
{
public static void main(String args[])
{
laptop l1= new laptop();
l1.setprice(35000);
System.out.println("PRICE="+l1.getprice());
}
}

class laptop
{
int ram;
private int price;
public void setprice(int price)
{
boolean admin=false;
if(!admin)
{
System.out.println("ONLY THE ADMIN CAN CHANGE");
}

else
{
this.price=price;
}

}
public int getprice()
{
return price;
}
}