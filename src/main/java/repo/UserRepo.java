package repo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import pojo.User;

public interface UserRepo extends MongoRepository<User, ObjectId>
{

}
