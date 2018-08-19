package spring.dao;

import java.util.List;

public interface UserDAO<T> {
    void addNewUser(T t);
    T getUserById(int id);
    T getUserByName(String name);
    void updateUser(T t);
    List<T> getAllUsers();
    void deleteUserById(int id);
}
