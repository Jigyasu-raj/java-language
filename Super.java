public class Super {
    public static void main(String[]args)//superkeyword as variable
    {
            B r=new B();
            r.show();
    }
}
class A{
    int a=12;
}
class B extends A{
    void show()
    {
        int a=23;
        System.out.println(a);
        System.out.println(super.a);
    }

}