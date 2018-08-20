package spring.services;

import spring.model.User;

import java.util.List;

public interface UserService {
    void add(User t);
    User getById(int id);
    User getByName(String name);
    void updateUser(User t);
    List<User> getAllUsers();
    void deleteUser(int i);
}
