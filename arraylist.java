import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class f23
{
public static void main(String args[])
{
List<String> studentName= new ArrayList<String>();
studentName.add("UTKAL");
studentName.add("SAHIL");
studentName.add("SANDEEP");

System.out.println(studentName);

studentName.add(1,"UJJAL");
System.out.println(studentName);

}
}