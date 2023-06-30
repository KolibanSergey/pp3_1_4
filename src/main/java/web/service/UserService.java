package web.service;



import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    void removeUser(long id);

    User getUserById(long id);

    User getByUserName(String userName);

}
