import java.util.Scanner;
public class itself {
    public static void main(Strings[]args)//Recursion
    {
        System.out.println("Enter number :-");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        itself r=new itself();
        r.sum(n);
        System.out.println("Sum of "+n+"natural number is "+r.sum(n));
    }
    public int sum(int b)
    {if(b>0)
        {
            return b+sum(b-1);
        }
        else{
            return 0;
        }

    }
}
