import java.util.Scanner;
public class Array6 {//Find smallest element of an array
    public static void main(Strings args[])
    { int i,j,smallest;
        System.out.println("Enter no of array Element:-");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]array=new int[n];
        System.out.println("Enter array element:-");
        for(i=0;i<n;i++)
        {
            array[i]=s.nextInt();
        }
        smallest=array[0];
        for(i=0;i<n;i++)
        {if(smallest>array[i])
            {
                smallest=array[i];
            }
            
        }
        System.out.println("Smallest =" +smallest);

    }
}
