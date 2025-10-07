//Single inheritace
    class A{
        void disp()
        {
            System.out.println("Parent class");
        }
    }
    class B extends A{
        void show()
        {
           System.out.println("child class");
        }
    }
    public class interitance{      
    public static void main(String[]args)
    {
       B obj = new B();//creating object
    // obj.disp();
    obj.show();
    }
    
    
}
    

