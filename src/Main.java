import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Human human1 = new Human(20, "Nihad", "Musayev");
//        Human human2 = new Human(15, "Ferid", "Musayev");
//        Human human3 = new Human(25, "Habib", "Musayev");
//        try {
//            StudentList.addUser(human1);
//            StudentList.addUser(human2);
//            StudentList.addUser(human3);
//        } catch (MyExp e) {
//            System.out.println("Xeta: " + e.getMessage());
//        }
//        System.out.println(StudentList.users);
        List<String> fruitWhiteList = List.of("alma", "armud", "banan", "heyva", "ciyelek");
        Scanner sc = new Scanner(System.in);
        Set<String> fruits = new HashSet<>();


        while (true) {
            String deyer = sc.nextLine();
            if (deyer.equals("show")) {
                for (String fruit : fruits) {
                    System.out.println(fruit);

                }
                continue;
            }
                try {
                    if (!fruitWhiteList.contains(deyer)) {
                        throw new RuntimeException("Bu meyve adi kecərli deyil");
                    }
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
                if (fruits.contains(deyer)) {
                    System.out.println("bu meyve daha once elave edilib");
                } else {
                    fruits.add(deyer);
                }

        }
    }}