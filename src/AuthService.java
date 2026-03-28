import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AuthService {
    static List<User> users = new ArrayList<>();

    public static void register(User user) {
        for (User u : users) {
            if (u.getUsername().equals(user.getUsername()))
                throw new AuthException("username artiq movcuddur");
        }
        if (user.getPassword().length() < 6) throw new AuthException("sifre cox qisadir");
        else users.add(user);
    }
    public static void login(String username, String password) {
        User found = null;
        for (User u : users) {
            if (u.getUsername().equals(username)) {
                found = u;
                break;
            }}
            if (found == null) throw new AuthException("username yoxdur");
            if (!found.getPassword().equals(password)) throw new AuthException("sifre yanlisdir");
            else System.out.println("Login is successfull");


    }

    public static void showUsers() {
            System.out.println(users);

    }
}
