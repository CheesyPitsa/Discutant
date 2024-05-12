package service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Role;
import repo.RoleRepo;

import java.util.List;

@Service
public class RoleService
{
    private final RoleRepo repo;
    @Autowired
    public RoleService(RoleRepo repo)
    {
        this.repo = repo;
    }
    public List<Role> getAllRoles()
    {
        return repo.findAll();
    }

    public void saveRole(Role role)
    {
        repo.save(role);
    }

    public void deleteRole(ObjectId id)
    {
        repo.deleteById(id);
    }
}
