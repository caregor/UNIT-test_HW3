package seminars.third.tdd;

import org.junit.jupiter.api.Test;
import seminars.third.coverage.User;
import seminars.third.coverage.hw.UserRepository;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    /**
     * 3.6. Нужно написать класс User (пользователь) с методом аутентификации по логину и паролю,
     * (В метод передаются логин и пароль, метод возвращает true, если пароль и логин совпадают, иначе - false)
     */
    @Test
    void userCreation() {
        User user = new User("lgn", "qwerty");
        String login = "lgn";
        String pass = "qwerty";
        assertTrue(user.auth(login, pass));
    }
   //Tests for Task 4
    @Test
    void addAuthenticatedUserToList(){
        UserRepository repository = new UserRepository();
        User user = new User("lgn", "qwerty");

        user.setAuthenticate(true);

        assertTrue(repository.addUser(user));
    }
    @Test
    void addNotAuthenticatedUserToList(){
        UserRepository repository = new UserRepository();
        User user = new User("lgn", "qwerty");

        assertFalse(repository.addUser(user));
    }
    // Tests for Task 5
    @Test
    void logoutIfNotAdmin(){
        UserRepository repository = new UserRepository();
        User user1 = new User("user1", "qwerty");
        User user2 = new User("user2", "qwerty");
        user1.setAuthenticate(true);
        user2.setAuthenticate(true);
        repository.addUser(user1);
        repository.addUser(user2);
        assertTrue(repository.logoutUsers(repository));
    }

}