import java.util.Scanner;
public class method {
    public static void myname(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[]args)
    {
        String name;
        System.out.println("Enter name:-");
      Scanner sc=new Scanner(System.in);
             name=sc.nextLine();
                 myname(name);
    }
}
