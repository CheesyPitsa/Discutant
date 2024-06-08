package controllers.discussion;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.Chat;
import pojo.Discussion;
import pojo.HaveChat;
import pojo.User;
import service.ChatService;
import service.DiscussionService;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


@RestController
public class DiscussionController
{
    private final DiscussionService discussionService;
    private final ChatService chatService;

    @Autowired
    public DiscussionController(DiscussionService service, ChatService chatService)
    {
        this.discussionService = service;
        this.chatService = chatService;
    }

    @PostMapping("/discussions/{discussion_id}")
    public Discussion postDiscussion(@PathVariable String discussion_id)
    {
        return discussionService.getDiscussionsById(new ObjectId(discussion_id));
    }

    @PostMapping("/discussions/{discussion_id}/chat")
    public List<Chat> postDiscussionChat(@PathVariable String discussion_id)
    {
        HaveChat discussion = discussionService.getDiscussionsById(new ObjectId(discussion_id));
        return chatService.getChatsByLocation(Collections.singletonList(discussion));
    }

    @PostMapping("/discussions/{discussion_id}/discutants")
    public List<User> postDiscussionDiscutants(@PathVariable String discussion_id)
    {
        Discussion discussion = discussionService.getDiscussionsById(new ObjectId(discussion_id));
        return discussion.getUsers();
    }
}
