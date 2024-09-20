package web.service;
import web.model.User;
import java.util.List;

public interface UserService {

    void createUsersTable();

    void dropUsersTable();

    void saveUser(String name, String lastName, byte age);

    void removeUserById(long id);

    List<User> getAllUsers();

    void cleanUsersTable();

    void updateUser(User user);

    User getUserById(long id);
}