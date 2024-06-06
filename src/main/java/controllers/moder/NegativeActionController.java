package controllers.moder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

@RestController
public class NegativeActionController
{
    private final UserService userService;

    @Autowired
    public NegativeActionController(UserService userService)
    {
        this.userService = userService;
    }
}
