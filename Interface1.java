
    public class Interface1{ //interfaces
        public static void main(String[]args)
        {
                A b=new B();//obj is reference variable of interfaces A
                     b.disp();
        }
    }
    interface A{
        void disp();//Here only declarartion
    }
    class B implements A{
       public void disp()
        {
    System.out.println("Interface A");
        }
    }

