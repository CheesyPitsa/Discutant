package controllers.discussion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.Discussion;
import pojo.User;
import service.DiscussionService;
import service.UserService;

import java.util.List;

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

    @PostMapping("/discussions/popular")
    public List<Discussion> postPopular()
    {
        return discussionService.findPopular();
    }

    @PostMapping("/discussions/feed")
    public List<Discussion> postDiscussions(String filters)
    {
        return discussionService.findByFilters(filters);
    }

}
