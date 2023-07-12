import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
class f27
{
    public static void main(String[] args) {
        Stack<String> fruits=new Stack<String>();
        fruits.push("apple");
        fruits.push("mango");
        fruits.push("banana");
        fruits.push("orange");

        System.out.println(fruits);

        
        System.out.println(fruits.peek());

        fruits.pop();
  System.out.println(fruits);
    }
}