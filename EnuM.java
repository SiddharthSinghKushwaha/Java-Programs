//Enum_use
import java.util.*;
public class EnuM {
    enum Rank {
        SOLDIER,
        SERGEANT,
        CAPTAIN
    }
    public static void main(String[] args) {
        Rank a = Rank.SERGEANT;
                
        switch(a) {
            case SOLDIER:
                System.out.println("Soldier says hi!");
                break;
            case SERGEANT:
                System.out.println("Sergeant says Hello!");
                break;
            case CAPTAIN:
                System.out.println("Captain says Welcome!");
                break;
        }
		int b=0;
		GenericClass gs=new GenericClass(b);  //where is T?
		
    }
}
class GenericClass<t> {
private T value;
private String type;

public GenericClass(T item) {
// TODO Auto-generated constructor stub
this.value = item;
this.type = item.getClass().getSimpleName();
}

public void showType() {
System.out.println(type + "\n" + value);
}
}