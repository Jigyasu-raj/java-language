import java.util.Scanner;
public class Strings4 {
    public static void main(String[]args)
    { int i,tolength=0;
        System.out.println("Enter the no of name");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String name[]=new String[n];
        System.out.println("Enter the names");
        for( i=0;i<n;i++)
        {
            name[i]=sc.nextLine();
            tolength=tolength+name[i].length();
        }
        System.out.println(name[i]);
        System.out.println("Total length is "+tolength);

    }
}
