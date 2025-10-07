public class Interface2 {
    public static void main(String[]args)
    {
            C obj=new C();
            obj.show1();
            obj.show2();
    }
}
interface A{
    void show1();
}
interface B extends A{// Relation between interface and interface
    void show2();
}
class C implements B{//Relation between class and interface
     public void show1()
    {
        System.out.println(" interface A");
    }
    public void show2()
    {
        System.out.println(" interface B");
    }    
}