import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class f25
{
public static void main(String args[])
{
List<Integer> list= new ArrayList<Integer>();
list.add(10);
list.add(20);
list.add(30);
list.add(40);
list.add(50);
System.out.println(list);

list.remove(0);
System.out.println(list);

list.remove(Integer.valueOf(50));
System.out.println(list);

}
}