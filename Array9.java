import java.util.Scanner;
public class Array9 {//Find sum and average of array element
    public static void main(Strings[]args)
    { int sum=0,i,n;
        float average;
        System.out.println("Enter the no of array element=");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int []array=new int[n];
        System.out.println("Enter array element:-=");
        for(i=0;i<n;i++)
        {
            array[i]=s.nextInt();
        }
        System.out.print("Sum of array element:-");
        for(i=0;i<n;i++)
        {
              sum=sum+array[i];
        }
        System.out.println(sum);
        average=sum/n;
        System.out.println("Average of array element:-"+average);



    }
}
