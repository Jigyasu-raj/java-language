
    import java.util.Scanner;
public class pattern5{
    public static void main(Strings[]args)
    {
        int n,i,j;
        System.out.println("Enter the number:-");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {for(j=1;j<=i;j++)
          {  System.out.print(j+ " ");}
          System.out.print("\n");
        }
    }
}



