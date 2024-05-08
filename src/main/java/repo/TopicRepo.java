package repo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import pojo.Topic;

public interface TopicRepo extends MongoRepository<Topic, ObjectId>
{

}
