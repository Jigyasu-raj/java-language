import java.util.Scanner;
public class pattern1 {
    public static void main(Strings[]args){
        int i,j,k,n;
        System.out.println("Enter the number:-");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        
        for(i=1;i<=n;i++)
        {
            for(j=i;j<=n;j++)
                {  System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
    System.out.print("* ");
            }
            System.out.print("\n");
        }
 
    }
}
