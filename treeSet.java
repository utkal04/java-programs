import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class f33
{
    public static void main(String[] args) {
        {
            Set<Integer> set=new TreeSet<Integer>();
            set.add(1);
            set.add(2);
            set.add(3);
            set.add(4);
            set.add(5);
            set.add(6);

            System.out.println(set);
            System.out.println("100 is present:"+set.contains(100));
            System.out.println("5 is present:"+set.contains(5));
            System.out.println("SIZE OF SET="+set.size());
            
        }
    }
}