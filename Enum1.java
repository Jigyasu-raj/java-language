
enum Direction{
    NORTH, SOUTH, EAST, WEST;
}
public class Enum1 {
    public static void main(String[]args)
    {
            //  Direction d=Direction.NORTH;
            for(Direction d :Direction.values())
            {
                System.out.println(d);
            }
             
    }
    
}
