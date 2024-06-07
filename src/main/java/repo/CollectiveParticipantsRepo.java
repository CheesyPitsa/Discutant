package repo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import pojo.Collective;
import pojo.CollectiveParticipant;

import java.util.List;

public interface CollectiveParticipantsRepo extends MongoRepository<CollectiveParticipant, ObjectId>
{
    public List<Collective> findBy(Collective collective);
}
