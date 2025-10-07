import java.util.Scanner;
public class reverspattern {
    public static void main(Strings[]args){
        int n,i,j;
        System.out.println("Enter the number:-");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=n;i>0;i--)
        {
            for(j=i;j>0;j--)
            {System.out.print("*");
        }
        System.out.print("\n");
        }
    }
}
