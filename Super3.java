public class Super3 {
    public static void main(String[]args)//superkeyword as obstract
    {
            B obj=new B();
            
    }
}
class A{
      A()
    {
System.out.println("class A");
    }
}
class B extends A{
    B()
    {//super(); class by default
System.out.println("class B");
    }
}
