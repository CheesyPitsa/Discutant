package repo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import pojo.Collective;
import pojo.User;

import java.util.List;

public interface CollectiveRepo extends MongoRepository<Collective, ObjectId>
{

}
