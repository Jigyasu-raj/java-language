import java.util.Scanner;
public class pattern8 {
    public static void main(Strings[]args){
        int i,j,k,n;
        System.out.println("Enter the number:");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=i;j<=n;j++)
          {
            System.out.print(" ");
          }
          for(k=1;k<=i;k++)
          {
            System.out.print("* ");
          }
          System.out.print("\n");
        }
        for(i=n;i>=1;i--)
        {
            for(j=i;j>=i;j--)
          {
            System.out.print(" ");
          }
          for(k=i;k>=1;k--)
          {
            System.out.print("* ");
          }
          System.out.print("\n");
        }
    }
}
