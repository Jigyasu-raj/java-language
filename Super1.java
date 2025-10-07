public class Super1 {
    public static void main(String[]args)//superkeyword as method
    {
             B obj=new B();
             obj.show();
    }
}
class A{
    void show()
    {
        System.out.println("Hello,world");
    }
}
class B extends A{
    void show()
    {       super.show();
        System.out.println("Hello");
    }
}
