package spring.dao;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import spring.model.User;

import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class UserHibernateDAO implements UserDAO<User> {

    @PersistenceContext
    private SessionFactory sessionFactory;


    private Session getSession() {
        return this.sessionFactory.openSession();
    }

    @Override
    public void addNewUser(User user) {
        getSession().save(user);
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
    @SuppressWarnings("unchecked")
    public List<User> getAllUsers() {
     ///   Criteria criteria = getSession().createCriteria(User.class);
        return null;
    }

    @Override
    public void deleteUserById(int id) {

    }
}
