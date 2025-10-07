public class Interface3{ 
    public static void main(String[]args)
    {    C obj=new C();
        obj.show1();
        obj.show2();

    }
}
interface A{
    void show1();
}
interface B{
    void show2();
}
class C implements A,B{//multiple inheritance using interface and class
    
     public void show1(){
        System.out.println("interface A");

    }
    public void show2(){
        System.out.println("interface B");

    }
}

