import java.util.ArrayList;
import java.util.List;

public class StudentList {

    public static List<Human> users = new ArrayList<>();

    public static void addUser(Human h){
        if(h.getAge() > 18) users.add(h);
        else throw new MyExp("18 den kiciksen");
    }

}