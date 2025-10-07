public class polymorphism2 {//Run time polymorphism
    //overriding
    public static void main(String[]args)
    {     A r=new B();//upcasting
        r.show();

    }
}
class A{
    void show()
    {
        System.out.println("Class A");
    }
}
class B extends A{
    void show()
    {
        System.out.println("Class B");
    }
}