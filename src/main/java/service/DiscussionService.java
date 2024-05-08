package service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Discussion;
import repo.DiscussionRepo;

import java.util.List;

@Service
public class DiscussionService
{
    private final DiscussionRepo repo;

    @Autowired
    public DiscussionService(DiscussionRepo repo)
    {
        this.repo = repo;
    }
    public List<Discussion> getAllDiscussions()
    {
        return repo.findAll();
    }

    public Discussion getDiscussionsById(ObjectId id)
    {
        return repo.findById(id).orElse(null);
    }

    public void saveDiscussion(Discussion discussion)
    {
        repo.save(discussion);
    }

    public void deleteDiscussion(ObjectId id)
    {
        repo.deleteById(id);
    }
}
