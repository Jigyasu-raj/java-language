import java.util.Scanner;
public class pattern7{
    public static void main(Strings[]args)
    {
        char i,j;
        char p;
        System.out.println("Enter the latter:-");
        Scanner s=new Scanner(System.in);
        p=s.next().charAt(0);
        for(i='A';i<=p;i++)
        {for(j='A';j<=i;j++)
          {  System.out.print(i+ " ");}
          System.out.print("\n");
        }
    }
}
