package service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.User;
import repo.UserRepo;

import java.util.List;

@Service
public class UserService
{
    private final UserRepo userRepo;
    @Autowired
    public UserService(UserRepo userRepo)
    {
        this.userRepo = userRepo;
    }
    public List<User> getAllUsers()
    {
        return userRepo.findAll();
    }

    public User getUserById(ObjectId id)
    {
        return userRepo.findById(id).orElse(null);
    }

    public void saveUser(User user)
    {
        userRepo.save(user);
    }

    public void deleteUser(ObjectId id)
    {
        userRepo.deleteById(id);
    }

    public User findByNickname(String nick)
    {
        return userRepo.findUserByUsername(nick);
    }
}
