import java.util.Scanner;
public class greaternum {
    public static void main(Strings[]args){
        int a,b,c;
        System.out.println("Enter any three number:-");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if((a>b)&&(a>c))
        {
            System.out.println( a+" is greater "); 
        }else{
            if((b>a)&&(b>c))
            {
                System.out.println(b+" is greater");
            }else{
                System.out.println(c+"is greater");
            }
        }
    }
}
