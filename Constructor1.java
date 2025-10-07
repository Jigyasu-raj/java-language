class A 
{
int a,b,c;
A(int x, int y)//parameterized constructor
{
    a=x;
    b=y;
    c=x+y;
}

void disp()
    {
        System.out.println(a+" "+b+" "+c);
    }
} 

public class Constructor1 {
    public static void main(String[]args)
    {
      A r=new A(12,13);
      r.disp();
    }
}
