package service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Collective;
import pojo.CollectiveParticipant;
import pojo.User;
import repo.CollectiveParticipantsRepo;
import repo.CollectiveRepo;

import java.util.List;
import java.util.Set;

@Service
public class CollectiveService
{
    private final CollectiveRepo repo;
    private final CollectiveParticipantsRepo participantsRepo;
    @Autowired
    public CollectiveService(CollectiveRepo repo, CollectiveParticipantsRepo participantsRepo)
    {
        this.repo = repo;
        this.participantsRepo = participantsRepo;
    }

    public List<Collective> getAllCollectives()
    {
        return repo.findAll();
    }

    public Collective getCollectiveById(ObjectId id)
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

    public Set<CollectiveParticipant> getCollectiveParticipants(ObjectId id)
    {
        Collective collective = repo.findById(id).orElse(null);
        if(collective != null)
        {
            return collective.getParticipants();
        }
        return null;
    }
}
