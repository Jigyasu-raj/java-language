abstract class person{
    person(){
        System.out.println("Person");//also create constrastor
    }
    abstract void show();
    void printData()//Also create normal method
    {
        System.out.println("print Data");
    }
}
class Sir extends person{
    void show()
    {
        System.out.println("Sir");
    }
}



public class Abstractclass {
    public static void main(String[]args)
    {
             person p=new Sir();
             p.show();
    }
}
