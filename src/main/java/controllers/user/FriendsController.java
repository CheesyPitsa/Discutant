package controllers.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.User;
import service.UserService;

import java.util.List;

@RestController
public class FriendsController
{
    private final UserService service;
    @Autowired
    public FriendsController(UserService service)
    {
        this.service = service;
    }

    @PostMapping("/users/{user_nickname}/friends")
    public List<User> postUserFriends(@PathVariable String user_nickname)
    {
        return service.findFriends(user_nickname);
    }
}
