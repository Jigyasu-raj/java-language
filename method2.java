//Addition of two numbers using method
import java.util.Scanner;
public class method2 {
    public int add(int a,int b){
        int sum;//non-static variable
        sum=a+b;
        return sum;
    }
    public static void main(Strings[]args)
    {
        int x,y,p;
        System.out.println("Enter any two number:-");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        method2 m=new method2();//creating object
        p=m.add(x,y);
        System.out.println("sum="+p);
    }
}