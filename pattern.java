import java.util.Scanner;
public class pattern {
    public static void main(Strings[]args){
        int n,i,j,k;
        System.out.println("Enter the number:-");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=0;i<=n;i++)
        {
           for(j=0;j<=i;j++)
           {
            System.out.print("*");
           }
         
           System.out.print("\n"); 
        }
    }
}
