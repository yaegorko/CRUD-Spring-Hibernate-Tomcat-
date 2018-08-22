package spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.dao.RoleDAO;
import spring.dao.UserDAO;
import spring.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;
    private final RoleDAO roleDAO;


    @Autowired
    public UserServiceImpl(UserDAO userDAO, RoleDAO roleDAO) {
        this.userDAO = userDAO;
        this.roleDAO = roleDAO;
    }



    @Override
    public void add(User user) {
        userDAO.addNewUser(user);
    }

    @Override
    public User getById(int id) {
        return userDAO.getUserUserById(id);
    }

    @Override
    public User getByName(String name) {
        return userDAO.getUserByName(name);
    }

    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public void deleteUser(int id) {
        userDAO.deleteUserById(id);
    }
}
