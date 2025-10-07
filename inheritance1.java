//multilevel inheritance
class A{
    void eat()
    {
        System.out.println("Eating");

    }
}
class B extends A{
    void sleep()
    {
        System.out.println("Sleeping");
    }
    
}
    class C extends B{
        void walk()
        {
            System.out.println("Walking");
        }
    }
public class inheritance1 {
    public static void main(String[]args)
    {  C obj=new C();//creating object
        // obj.eat();
        // obj.sleep();
        obj.walk();

    }
}
