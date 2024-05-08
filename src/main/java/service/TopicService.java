package service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Topic;
import repo.TopicRepo;

import java.util.List;

@Service
public class TopicService
{
    private final TopicRepo topicRepo;
    @Autowired
    public TopicService(TopicRepo topicRepo)
    {
        this.topicRepo = topicRepo;
    }
    public List<Topic> getAllTopics()
    {
        return topicRepo.findAll();
    }

    public Topic getTopicById(ObjectId id)
    {
        return topicRepo.findById(id).orElse(null);
    }

    public void saveTopic(Topic user)
    {
        topicRepo.save(user);
    }

    public void deleteTopic(ObjectId id)
    {
        topicRepo.deleteById(id);
    }
}
