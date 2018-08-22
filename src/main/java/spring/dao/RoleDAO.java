package spring.dao;

import spring.model.Role;

public interface RoleDAO {
    Role getRoleByName(String roleName);
    Role getRoleById(int id);
}
