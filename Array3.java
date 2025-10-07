import java.util.Scanner;
public class Array3 {// take input from user and print array element 
    public static void main(Strings[]args)
    {
        System.out.println("Enter the no of array element:-");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//First array size define
        int[]array=new int[n];
        
        System.out.println("Enter the array emelent:-");
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("Array elements");
        for(int i=0;i<n;i++)
        {
            System.out.println(array[i]);
        }
    }
}
