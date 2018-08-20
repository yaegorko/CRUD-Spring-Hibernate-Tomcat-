package spring.dao;

import org.springframework.stereotype.Repository;
import spring.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserHibernateEntityManagerDAO implements UserDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addNewUser(User user) {

    }

    @Override
    public User geUserUserById(int id) {
        Query query = entityManager.createQuery("SELECT u FROM User u WHERE u.id = ?1");
        query.setParameter(1, id);
        User user = (User)query.getSingleResult();
        return user;
    }

    @Override
    public User getUserByName(String name) {
        return null;
    }

    @Override
    public void updateUser(User t) {

    }

    @Override
    public List<User> getAllUsers() {
        List<User> list = entityManager.createQuery("SELECT u FROM User u").getResultList();
        return list;
    }

    @Override
    public void deleteUserById(int id) {

    }
}
