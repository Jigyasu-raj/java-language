import java.util.Scanner;

public class Sumofdigit {
    public static void main(String[]args)
    {
       int n,sum=0,rem,i;
       System.out.println("Enter the number:-");
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       while(n>0)
       {
        rem=n%10;
        sum=sum+rem;
        n=n/10;
        
       }
       System.out.println("Sum of digit of a number is "+sum); 
    }
}
