import java.util.Scanner;
public class pattern6{
    public static void main(Strings[]args)
    {
        int n,i,j, count=0;
        System.out.println("Enter the number:-");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {for(j=1;j<=i;j++)
          { 
            count++; 
            System.out.print(count+" ");}
          System.out.print("\n");
        }
    } 
}
