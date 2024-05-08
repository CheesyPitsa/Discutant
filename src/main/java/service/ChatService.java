package service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Chat;
import repo.ChatRepo;

import java.util.List;

@Service
public class ChatService
{
    private final ChatRepo repo;
    @Autowired
    public ChatService(ChatRepo repo)
    {
        this.repo = repo;
    }

    public List<Chat> getAllChats()
    {
        return repo.findAll();
    }

    public Chat getChatsById(ObjectId id)
    {
        return repo.findById(id).orElse(null);
    }

    public void saveChat(Chat chat)
    {
        repo.save(chat);
    }

    public void deleteChat(ObjectId id)
    {
        repo.deleteById(id);
    }
}
