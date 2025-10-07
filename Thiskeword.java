
   class A{
    int a;
    void show(int a)
    {
        
        this.a=a;//use this keyword
        System.out.println(a);
    }
   } 
   public class Thiskeword {
    public static void main(String[]atgs)
    {
          A r=new A();

          r.show(100);
    }
}
