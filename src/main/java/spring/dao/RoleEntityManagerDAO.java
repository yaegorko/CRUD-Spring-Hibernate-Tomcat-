package spring.dao;

import org.springframework.stereotype.Repository;
import spring.model.Role;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
@Repository
public class RoleEntityManagerDAO implements RoleDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Role getRoleByName(String roleName) {
        Query query = entityManager.createQuery("SELECT r FROM Role r WHERE r.role = ?1").setParameter(1, roleName);
        return (Role) query.getSingleResult();
    }

    @Override
    public Role getRoleById(int id) {
        Query query = entityManager.createQuery("SELECT r FROM Role r WHERE r.id = ?1").setParameter(1, id);
        return (Role) query.getSingleResult();
    }
}
