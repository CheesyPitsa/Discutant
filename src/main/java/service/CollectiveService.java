package service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Collective;
import repo.CollectiveRepo;

import java.util.List;

@Service
public class CollectiveService
{
    private final CollectiveRepo repo;
    @Autowired
    public CollectiveService(CollectiveRepo repo)
    {
        this.repo = repo;
    }

    public List<Collective> getAllCollectives()
    {
        return repo.findAll();
    }

    public Collective getCollectivesById(ObjectId id)
    {
        return repo.findById(id).orElse(null);
    }

    public void saveCollective(Collective collective)
    {
        repo.save(collective);
    }

    public void deleteCollective(ObjectId id)
    {
        repo.deleteById(id);
    }
}
