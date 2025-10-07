import java.util.Scanner;
public class polymorphism1 {
    //method overloading
    public static void main(String[]args)
    { polymorphism1 r=new polymorphism1();
        r.add();
        System.out.println("Enter any two number:-");
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int q=sc.nextInt();
        r.add(p,q);  

    }
    void add(){
        int a,b,c;
        System.out.println("Enter any Two number:-");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        // a=12;
        // b=45;
         c=a+b;
        System.out.println(a+" "+b+" "+c);
    }
    void add(int x,int y)
    {
        int c;
        c=x+y;
        System.out.println(c);
    }
    
}
