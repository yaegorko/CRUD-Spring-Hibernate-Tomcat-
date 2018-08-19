package spring.services;

import java.util.List;

public interface UserService<T> {
    void add(T t);
    T getById(int id);
    T getByName(String name);
    void updateUser(T t);
    List<T> getAllUsers();
    void deleteUser(int i);
}
