package controllers.collective;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import service.ChatService;
import service.CollectiveService;

@RestController
public class CollectiveController
{
    private final CollectiveService collectiveService;
    private final ChatService chatService;

    @Autowired
    public CollectiveController(CollectiveService collectiveService, ChatService chatService)
    {
        this.collectiveService = collectiveService;
        this.chatService = chatService;
    }
}
