public class Interface {//interfaces
    public static void main(String[]args)
    {
            B b=new B();//Abstract method
            b.disp();
    }
}
interface A{
    void disp();
}
class B implements A{
   public void disp()
    {
System.out.println("Interface A");
    }
}
