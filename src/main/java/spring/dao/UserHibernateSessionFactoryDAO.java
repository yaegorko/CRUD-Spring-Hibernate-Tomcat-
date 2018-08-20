package spring.dao;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spring.model.User;

import java.util.List;

//@Repository
public class UserHibernateSessionFactoryDAO implements UserDAO {

    private final SessionFactory sessionFactory;

    @Autowired
    public UserHibernateSessionFactoryDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session startSession() {
        return sessionFactory.openSession();
    }


    @Override
    public void addNewUser(User user) {

    }

    @Override
    public User geUserUserById(int id) {
        return null;
    }

    @Override
    public User getUserByName(String name) {
        return null;
    }

    @Override
    public void updateUser(User t) {

    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> getAllUsers() {
//       TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("SELECT u FROM User u", User.class);
//       return query.getResultList();
//        TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User");
//        return query.getResultList();
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
        return criteria.list();
    }

    @Override
    public void deleteUserById(int id) {

    }
}
