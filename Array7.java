import java.util.Scanner;
public class Array7 {//Arrange array element
    public static void main(Strings[]args)
    {int i,n,temp,j;
        System.out.println("Enter the no of array element:-");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int[]array=new int[n];
        System.out.println("Enter array element:-");
        for(i=0;i<n;i++)
        {
            array[i]=s.nextInt();
        }
        System.out.println("Array element in arraging order:");
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(array[i]>array[j])
                {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
            System.out.println(array[i]);
        }
        

    }
}