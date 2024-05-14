package repo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import pojo.User;

public interface UserRepo extends MongoRepository<User, ObjectId>
{
    @Query("{username:'?0'}")
    User findUserByUsername(String username);

    @Query("{username:'?0', fields = \"{ 'password' : 0, 'role' : 0 }\"}")
    User findUserProfileByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
