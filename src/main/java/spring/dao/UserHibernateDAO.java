package spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import spring.model.User;

import javax.persistence.PersistenceContext;
import java.util.List;

public class UserHibernateDAO implements UserDAO<User> {

    @PersistenceContext
    private SessionFactory sessionFactory;

    private Session getSession() {
        return this.sessionFactory.openSession();
    }

    @Override
    public void addNewUser(User user) {

    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public User getUserByName(String name) {
        return null;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void deleteUserById(int id) {

    }
}
