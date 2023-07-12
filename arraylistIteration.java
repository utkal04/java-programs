import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
class f26
{
public static void main(String args[])
{
List<Integer> list= new ArrayList<Integer>();
list.add(10);
list.add(20);
list.add(30);
list.add(40);
list.add(50);
list.add(60);
list.add(70);
list.add(80);
list.add(90);
list.add(100);
System.out.println(list);

System.out.println("USING FOR LOOP");
for(int i=0;i<list.size();i++)
{
System.out.println(list.get(i));
}

System.out.println("USING FOR EACH");
for(Integer element:list)
{
System.out.println(element);
}

System.out.println("USING ITERATOR");
Iterator<Integer> a=list.iterator();
while(a.hasNext())
{
System.out.println(a.next());
}

}
}