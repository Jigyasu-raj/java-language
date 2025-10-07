import java.util.Scanner;
public class pattern3 {
    public static void main(Strings[]args){
        int i,j,n;
        System.out.println("Enter the number:-");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {   if(i==1||i==n || j==1 ||j==n)
          System.out.print("*");
          else{
            System.out.print(" ");
          }
        }
      
        System.out.print("\n");
        }
      
    }
}
