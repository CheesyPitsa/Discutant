package repo;

import org.bson.types.ObjectId;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.core.query.Query;
import pojo.Discussion;

import java.util.Date;
import java.util.List;

public interface DiscussionRepo extends MongoRepository<Discussion, ObjectId>
{
    public List<Discussion> findAllByDateAfter(Date date);

    List<Discussion> findByDateGreaterThanEqualOrderByViewsAsc(Date date, Sort sort);

    List findBy(Query query);
}
