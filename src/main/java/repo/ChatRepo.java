package repo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import pojo.Chat;

public interface ChatRepo extends MongoRepository<Chat, ObjectId>
{

}
