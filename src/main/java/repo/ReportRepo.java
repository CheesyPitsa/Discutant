package repo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import pojo.CanBeReported;
import pojo.Report;
import pojo.User;

import java.util.List;

public interface ReportRepo extends MongoRepository<Report, ObjectId>
{

    List<Report> findByCreator(User creator);

    List<Report> findByReportObject(CanBeReported reportObject);
}
