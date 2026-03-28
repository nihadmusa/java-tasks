import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        User user1 = new User("1234567nihad", "nihad");
        User user2 = new User("5aura", "aura");
        User user3 = new User("olympic0", "olymp");

        while (true) {
            System.out.println("1 - Register\n" +
                    "2 - Login\n" +
                    "3 - Show Users\n" +
                    "4 - Exit");
            String choice = sc.nextLine();
            try {
                switch (choice) {
                    case "1": {
                        System.out.println("Yeni username: ");
                        String username = sc.nextLine();
                        System.out.println("Yeni password: ");
                        String password = sc.nextLine();
                        AuthService.register(new User(username, password));
                        System.out.println("Qeydiyyat ugurlu oldu!");
                        break;
                    }
                    case "2": {
                        System.out.println("Yeni username: ");
                        String username = sc.nextLine();
                        System.out.println("Yeni password: ");
                        String password = sc.nextLine();
                        AuthService.login(username, password);
                        System.out.println("Qeydiyyat ugurlu oldu!");
                        break;
                    }
                    case "3": {
                        AuthService.showUsers();
                        break;
                    }
                    case "4": {
                        System.exit(0);
                    }
                    default:
                        System.out.println("Yanlis secim, tekrar coxun.");

                }
            } catch (AuthException e) {
                System.out.println(e.getMessage());
            }

        }

    }


}


