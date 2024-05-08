package repo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import pojo.Report;

public interface ReportRepo extends MongoRepository<Report, ObjectId>
{

}
