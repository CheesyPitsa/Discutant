package controllers.collective;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.Chat;
import pojo.Collective;
import pojo.CollectiveParticipant;
import pojo.HaveChat;
import service.ChatService;
import service.CollectiveService;

import java.util.*;

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

    @PostMapping("/collectives/{collective_id}")
    public Collective postCollectiveData(@PathVariable String collective_id)
    {
        return collectiveService.getCollectiveById(new ObjectId(collective_id));
    }

    @PostMapping("/collectives/{collective_id}/participants")
    public Set<CollectiveParticipant> postCollectiveParticipants(@PathVariable String collective_id)
    {
        return collectiveService.getCollectiveParticipants(new ObjectId(collective_id));
    }

    @PostMapping("/collectives/{collective_id}/chats")
    public List<Chat> postCollectiveChats(@PathVariable String collective_id)
    {
        Collective collective = collectiveService.getCollectiveById(new ObjectId(collective_id));
        List<HaveChat> location = Collections.singletonList(collective);
        return chatService.getChatsByLocation(location);
    }
}
