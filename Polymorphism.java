class A{//compile time polymorphism
    // method overloading


 void add()
{
    int a=5,b=56,c=a+b;
    System.out.println(a+" "+b+" "+c);

}
void add(int x,int y)
 {
    int c;
    c=x+y;
    System.out.println(c);
 }
}

public class  Polymorphism {
    public static void main(String[]args)
    {   A r=new A();
        r.add();
        r.add(10,30);
    
    }
}
