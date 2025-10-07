import java.util.Scanner;
public class Array4 {//to search element in array if present and print that location
    public static void main(Strings[]args){
        int i;
        System.out.println("Enter the no of array element:-");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]array=new int[n];
        System.out.println("Enter array element:-");
        for( i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the no which we want to find:-");
        int x=sc.nextInt();
        for( i=0;i<n;i++)
        { if(array[i]==x)
        {
            System.out.println("Element is found at loaction "+(i+1));
        }

        }
        if(i==n)
        {
            System.out.println("Element not found");
        }
    }
}
