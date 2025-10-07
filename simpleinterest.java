import java.util.Scanner;
public class simpleinterest {
    public static void main(Strings[]args){
        float p,r,t;
        System.out.println("Enter the principle,time and rate:-");
        Scanner s=new Scanner(System.in);
        p=s.nextFloat();
        r=s.nextFloat();
        t=s.nextFloat();
        System.out.println("Simple interest="+((p*t*r)/100));

    }
}
;