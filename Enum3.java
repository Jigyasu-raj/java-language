enum planets{
    MARS, SUN,MOON,EARTH, JUPTER,STURN;
}
public class Enum3 {//ENUM USING SWITCH CASE
    public static void main(String[]args){
         planets p=planets.MOON;
         switch(p)
         {
            case MARS:
            System.out.println("Mars");
            break;
            case MOON:
            System.out.println("Moon");
            break;
            case SUN:
            System.out.println("Sun");
            break;
            case EARTH:
            System.out.println("Earth");
            break;
            case STURN:
            System.out.println("Sturn");
            break;
            case JUPTER:
            System.out.println("Jupter");
            Default:
            System.out.println("Thanks");
         }
    }
    
}
