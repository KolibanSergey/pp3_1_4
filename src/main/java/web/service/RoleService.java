package web.service;


import web.model.Role;

import java.util.List;

public interface RoleService {
    Role getRole(String role);
    List<Role> getAllRoles();

}
