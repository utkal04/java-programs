import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class f24
{
public static void main(String args[])
{
List<String> studentName= new ArrayList<String>();
studentName.add("UTKAL");
studentName.add("SAHIL");
studentName.add("SANDEEP");

System.out.println(studentName);

List<String> newStudentName= new ArrayList<String>();
newStudentName.add("SURAJ");
newStudentName.add("KUMAR");
newStudentName.add("DEBASHISH");

studentName.addAll(newStudentName);
System.out.println(studentName);
System.out.println(studentName.get(3));
}
}