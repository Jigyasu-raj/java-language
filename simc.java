import java.util.Scanner;
class simc{
public static void main(String []args){
int a,b;
int optr;
System.out.println("Enter any two number:-");
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
System.out.println("Enter operater :-");
optr=s.nextInt();
if(optr==+)
{System.out.println("Addition="+(a+b));
}
if(optr==-)
{System.out.println("Substraction="+(a-b));
}
if(optr==*)
{System.out.println("Multiplication="+(a*b));
}
if(optr==/                                                                  )
{System.out.println("Division="+(a/b));
}


}


}