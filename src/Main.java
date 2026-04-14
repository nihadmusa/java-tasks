import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        User user1 = new User("1234567nihad", "nihad");
//        User user2 = new User("5aura", "aura");
//        User user3 = new User("olympic0", "olymp");
//
//        while (true) {
//            System.out.println("1 - Register\n" +
//                    "2 - Login\n" +
//                    "3 - Show Users\n" +
//                    "4 - Exit");
//            String choice = sc.nextLine();
//            try {
//                switch (choice) {
//                    case "1": {
//                        System.out.println("Yeni username: ");
//                        String username = sc.nextLine();
//                        System.out.println("Yeni password: ");
//                        String password = sc.nextLine();
//                        AuthService.register(new User(username, password));
//                        System.out.println("Qeydiyyat ugurlu oldu!");
//                        break;
//                    }
//                    case "2": {
//                        System.out.println("Yeni username: ");
//                        String username = sc.nextLine();
//                        System.out.println("Yeni password: ");
//                        String password = sc.nextLine();
//                        AuthService.login(username, password);
//                        System.out.println("Qeydiyyat ugurlu oldu!");
//                        break;
//                    }
//                    case "3": {
//                        AuthService.showUsers();
//                        break;
//                    }
//                    case "4": {
//                        System.exit(0);
//                    }
//                    default:
//                        System.out.println("Yanlis secim, tekrar coxun.");
//
//                }
//            } catch (AuthException e) {
//                System.out.println(e.getMessage());
//            }
//
//        }

//        ArrayList<Student> list = new ArrayList<>();
//        list.add(new Student("nihad",20,95.9));
//        list.add(new Student("musa",23,86.9));
//        list.add(new Student("tunz",19,86.6));
//
//        Collections.sort(list, new GradeComparator());
//        list.forEach(System.out::println);
//
//        Comparator<Student> comparator = Comparator.comparingInt(Student::getAge)
//                .thenComparing(Student::getName);
//        Collections.sort(list, comparator);
//        list.forEach(System.out::println);
        Company c1 = new Company("IT", 3000);
        Company c2 = new Company("Construction", 2000);
        Company c3 = new Company("Car", 4000);

        Human h1 = new Human(20, "Nihad", "Musayev", new Company[]{c1, c3});
        Human h2 = new Human(34, "Ferid", "Seferov", new Company[]{c2});
        Human h3 = new Human(28, "Musa", "Eliyev", new Company[]{c1, c2});
        Human h4 = new Human(34, "Gulu", "Eliyeva", new Company[]{c1, c2,c3});
        List<Human> humans = new ArrayList<>(List.of(h1, h2, h3, h4));


        Comparator comparator= Comparator
                        .comparingDouble((Human h)-> Arrays.stream(h.getCompanies())
                                .mapToDouble(Company::getSalary).sum());

        Collections.sort(humans, comparator.reversed());

        humans.forEach(h-> System.out.println(Arrays.stream(h.getCompanies())
                        .mapToDouble(Company::getSalary).sum()));



    }
}



