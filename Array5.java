import java.util.Scanner;
public class Array5 {//find bigest element of an array
    public static void main(Strings args[])
    { int i,j,bigest;
        System.out.println("Enter no of array Element:-");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]array=new int[n];
        System.out.println("Enter array element:-");
        for(i=0;i<n;i++)
        {
            array[i]=s.nextInt();
        }
        bigest=array[0];
        for(i=0;i<n;i++)
        {if(bigest<array[i])
            {
                bigest=array[i];
            }
            
        }
        System.out.println("bigest =" +bigest);

    }
}
