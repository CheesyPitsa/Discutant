package repo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import pojo.DiscussionSettings;

public interface DiscussionSettingsRepo extends MongoRepository<DiscussionSettings, ObjectId>
{

}
