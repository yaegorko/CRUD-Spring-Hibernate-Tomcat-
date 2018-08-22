package spring.dao;

import spring.model.User;

import java.util.List;

public interface UserDAO {
    void addNewUser(User user);
    User getUserUserById(int id);
    User getUserByName(String name);
    void updateUser(User t);
    List<User> getAllUsers();
    void deleteUserById(int id);
}
