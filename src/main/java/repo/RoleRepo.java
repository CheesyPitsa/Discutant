package repo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import pojo.ERole;
import pojo.Role;

public interface RoleRepo extends MongoRepository<Role, ObjectId>
{
    Role findByName(ERole name);
}
