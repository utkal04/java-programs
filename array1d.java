import java.util.Scanner;
class f4
{
    public static void main(String args[])
    {
        // creation of array if we know the values
        int arr1[]={1,2,3,4};
        System.out.println(arr1[2]);
        // creation of array if we take user input
        Scanner sc =new Scanner(System.in);
        int arr2[]=new int[4];
        System.out.println("enter the values");
        for(int i=0;i<=3;i++)
        {
int a=sc.nextInt();
arr2[i]=a;
        }
        System.out.println("the nos are");
         for(int i=0;i<=3;i++)
        {
            System.out.println(arr2[i]);
        }
    }
}