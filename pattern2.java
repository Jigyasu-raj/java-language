import java.util.Scanner;
public class pattern2 {
    public static void main(Strings[]args){
    int i,j,n;
    System.out.println("Enter the number:-");
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n;j++)
        {
            System.out.print("*");
        }
        System.out.print("\n");
    }
}
}
