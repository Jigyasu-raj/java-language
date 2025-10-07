import java.util.Scanner;
public class primenumber{
    public static void main(Strings[]args){
        int n,i,count=0;
        System.out.println("Enter the number :-");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=1;i<=n;i++){
            if(n%i==0)
            { count++;}
        }
        if(count==2)
        { System.out.println("Prime number");}
        else{ System.out.println(" Not Prime number");}

        }
       

    }

