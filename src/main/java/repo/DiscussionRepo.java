package repo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import pojo.Discussion;

public interface DiscussionRepo extends MongoRepository<Discussion, ObjectId>
{

}
