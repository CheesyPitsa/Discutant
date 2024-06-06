package controllers.discussion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import service.ChatService;
import service.DiscussionService;

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
}
