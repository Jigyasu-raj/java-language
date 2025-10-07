import java.util.Scanner;
public class Array10 {
    public static void main(Strings[]args)
    { int row,column, i,j;
        System.out.println("Enter the no of row :-");
        Scanner sc=new Scanner(System.in);
        row=sc.nextInt();
        System.out.println("Enter the no of column :-");
        column=sc.nextInt();
        System.out.println("Ente row and column element:-");
        int[][]array=new int[row][column];
        for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                array[i][j]=sc.nextInt();

            }
        }
        System.out.println("Array element as matrix form:-");
        for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                System.out.print(array[i][j]+"  ");

            }
            System.out.print("\n");
        }
        System.out.println("Transpose of matrix:-");
        for(j=0;j<column;j++)
        {
            for(i=0;i<row;i++)
            {
                System.out.print(array[i][j]+"  ");

            }
            System.out.print("\n");
        }


    }
}
