package spring.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.config.DBConfigEntityManager;
import spring.config.WebConfig;
import spring.model.Role;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DBConfigEntityManager.class})
public class RoleEntityManagerDAOTest {

    @Autowired
    RoleDAO roleDAO;

    @Test
    public void testGetRoleByName() {
        Role role = roleDAO.getRoleByName("ADMIN");
        assertThat(role.getRole(), is("ADMIN"));
    }

}