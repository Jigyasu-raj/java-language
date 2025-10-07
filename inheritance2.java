//hierarchical inheritance
class A{
    void Entername()
    {
        System.out.println("Enter your name");
    }
}
class B extends A{
     void Myname()
    {
        System.out.println("Sandeep kumar verma");
    }
}
class C extends A{
    void name()
   {
       System.out.println("Kanhaiya kumar gupta");
   }
}
public class inheritance2{
    public static void main(String[]args)
    {
        B obj=new B();C obj1=new C();
        obj.Myname();obj1.name();       
    }
}
