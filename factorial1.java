import java.util.Scanner;
public class factorial1 {//print factorial using recursion
    public static void main(Strings[]args)
    {
        System.out.println("Enter any number:-");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        factorial1 r=new factorial1();
        System.out.println("Factorial of " +n+"="+r.factorial(n));

    }
    public int factorial(int x)
    {
    
        if(x>0)
        {
           return x*factorial(x-1); 
        }
        else{
            return 1;
        }
    }
}
