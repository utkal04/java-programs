import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

class f32
{
    public static void main(String[] args) {
        {
            Set<Integer> set=new LinkedHashSet<Integer>();
            set.add(100);
            set.add(22);
            set.add(3);

            System.out.println(set);
            System.out.println("100 is present:"+set.contains(100));
            System.out.println("50 is present:"+set.contains(50));
            System.out.println("SIZE OF SET="+set.size());
            
        }
    }
}