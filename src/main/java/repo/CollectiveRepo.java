package repo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import pojo.Collective;

public interface CollectiveRepo extends MongoRepository<Collective, ObjectId>
{

}
