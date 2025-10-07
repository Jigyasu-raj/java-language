import java.util.Scanner;
public class twodimensionalarray
{
 public static void main(Strings[]args)
    { 
        int i,j;
        Scanner s=new Scanner(System.in);
        System.out.println("Ente the no of rows:-");
        int n=s.nextInt();
        System.out.println("Ente the no of column:-");
        int m=s.nextInt();
        int[][]array=new int[n][m];
        System.out.println("Enter 2D   array element:-");
    for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        {
              array[i][j]=s.nextInt();
        }
    }
    System.out.println("2D   array elements");
    for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        {
             System.out.print(array[i][j]+"  ");
        }
        System.out.println("\n");
    }


    }
    
}