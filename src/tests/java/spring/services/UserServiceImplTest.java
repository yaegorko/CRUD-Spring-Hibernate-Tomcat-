package spring.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.config.DBConfigEntityManager;
import spring.dao.RoleDAO;
import spring.model.Role;
import spring.model.User;

import java.util.Set;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DBConfigEntityManager.class})
public class UserServiceImplTest {

    @Autowired
    UserService userService;
    @Autowired
    RoleDAO roleDAO;

    @Test
    public void testGetUserByName() {
        User user = userService.getByName("admin");
        assertThat(user.getName(), is("admin"));
    }

    @Test
    public void testGetRole() {
        User user = userService.getById(1);
        User admin = userService.getById(2);
        Role role = roleDAO.getRoleByName("ADMIN");
        Set<Role> setUser = user.getRoles();
        Set<Role> setAdmin = admin.getRoles();
        System.out.println(" ");
    //    assertThat(setAdmin.contains(role), is(true));
    }
}