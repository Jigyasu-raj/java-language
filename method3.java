//find factorial using method
import java.util.Scanner;
public class method3 {
    public int factorial(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(Strings args[])
    {
        System.out.println("Enter number:-");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        method3 m=new method3();//creating object
        System.out.println("factorial is "+m.factorial(x));
    }
}

