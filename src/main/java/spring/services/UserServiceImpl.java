package spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.dao.UserDAO;
import spring.model.User;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


    @Override
    public void add(User user) {

    }

    @Override
    public User getById(int id) {
        return userDAO.geUserUserById(id);
    }

    @Override
    public User getByName(String name) {
        return null;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public void deleteUser(int i) {

    }
}
