package controllers.collective;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.*;
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

    @PostMapping("/collectives/{collective_id}/roles")
    public Set<CollectiveRole> postCollectiveRoles(@PathVariable String collective_id)
    {
        Collective collective = collectiveService.getCollectiveById(new ObjectId(collective_id));
        return collective.getRoles();
    }

    @PostMapping("/collectives/{collective_id}/possibilities")
    public List<CollectivePossibilities> postCollectivePossibilities(@PathVariable String collective_id)
    {
        Collective collective = collectiveService.getCollectiveById(new ObjectId(collective_id));
        Set<CollectiveRole> roles = collective.getRoles();
        List<CollectivePossibilities> possibilities = new ArrayList<>();
        for (CollectiveRole role : roles)
        {
            Set<CollectiveRole.Rights> rights = role.getRights();
            for (CollectiveRole.Rights right : rights)
            {
                possibilities.add(right.getPossibility());
            }
        }
        return possibilities;
    }
}
