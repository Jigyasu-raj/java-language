import java.util.Scanner;
public class pattern9 {
    public static void main(Strings[]args)
    {
        int i,n,j;
        System.out.println("Enter number:-");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(i=n-1;i>=1;i--)
        {
            for(j=i;j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
