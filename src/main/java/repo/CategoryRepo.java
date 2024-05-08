package repo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import pojo.Category;

public interface CategoryRepo extends MongoRepository<Category, ObjectId>
{

}
