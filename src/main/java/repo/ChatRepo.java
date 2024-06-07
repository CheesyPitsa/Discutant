package repo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pojo.Chat;
import pojo.HaveChat;

import java.util.List;

public interface ChatRepo extends MongoRepository<Chat, ObjectId>
{
    public List<Chat> findByLocation(List<HaveChat> location);
}
