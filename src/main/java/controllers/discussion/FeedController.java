package controllers.discussion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import service.DiscussionService;
import service.UserService;

@RestController
public class FeedController //Лента дискуссий
{
    private final DiscussionService discussionService;
    private final UserService userService;

    @Autowired
    public FeedController(DiscussionService discussionService, UserService userService)
    {
        this.discussionService = discussionService;
        this.userService = userService;
    }
}
