import java.util.Scanner;
public class inverseofnumber {
    public static void main(String[]args)
    {
        int n,i,rem,reverse=0;
        System.out.println("Enter the number:-");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            rem=n%10;
            reverse=(reverse*10)+rem;
            n=n/10;
        }
        System.out.println("Reverse of number is "+reverse);
    }
}
