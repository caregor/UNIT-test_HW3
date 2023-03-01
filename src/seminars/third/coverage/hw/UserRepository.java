package seminars.third.coverage.hw;

import seminars.third.coverage.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> users = new ArrayList<>();
    public void addUser(User user){
        if (user.isAuthenticate()) users.add(user);
        else System.out.println("User is not Authenticate");
    }
}
