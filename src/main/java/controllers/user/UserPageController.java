package controllers.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pojo.User;
import service.UserService;

@RestController
public class UserPageController
{
    private final UserService service;
    @Autowired
    public UserPageController(UserService service)
    {
        this.service = service;
    }

    @PostMapping("/users/profile/{user_nickname}")
    public User postUserProfile(@PathVariable String user_nickname)
    {
        return service.findProfileByNickname(user_nickname);
    }
}
