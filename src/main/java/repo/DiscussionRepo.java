package repo;

import org.bson.types.ObjectId;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.core.query.Query;
import pojo.Discussion;
import pojo.User;

import java.util.Date;
import java.util.List;

public interface DiscussionRepo extends MongoRepository<Discussion, ObjectId>
{
    public List<Discussion> findByDateGreaterThanEqualOrderByViewsAsc(Date date, Sort sort);

    List findBy(Query query);

    public List<Discussion> findDiscussionsByCreatorOrUsersContains(User creator, User users);
}
