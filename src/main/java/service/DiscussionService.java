package service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.CriteriaDefinition;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import pojo.Discussion;
import pojo.User;
import repo.DiscussionRepo;

import java.util.Calendar;
import java.util.List;

@Service
public class DiscussionService
{
    private final DiscussionRepo repo;

    @Autowired
    public DiscussionService(DiscussionRepo repo)
    {
        this.repo = repo;
    }
    public List<Discussion> getAllDiscussions()
    {
        return repo.findAll();
    }

    public Discussion getDiscussionsById(ObjectId id)
    {
        return repo.findById(id).orElse(null);
    }

    public void saveDiscussion(Discussion discussion)
    {
        repo.save(discussion);
    }

    public void deleteDiscussion(ObjectId id)
    {
        repo.deleteById(id);
    }

    public List<Discussion> findPopular()
    {
        Calendar cal = Calendar.getInstance();//дает получить только дискуссии, проводимые не ранее чем неделю назад
        cal.add(Calendar.DATE, -7);
        return repo.findByDateGreaterThanEqualOrderByViewsAsc(cal.getTime(), Sort.by("views").descending());
    }

    public List<Discussion> findByFilters(String filter)
    {
        CriteriaDefinition request = CreateRequestWithFilter(filter);
        Query query = new Query(request);
        return repo.findBy(query);
    }

    public List<Discussion> findByDiscutant(User user)
    {
        return repo.findDiscussionsByCreatorOrUsersContains(user, user);
    }

    private CriteriaDefinition CreateRequestWithFilter(String filters)
    {
        return new Criteria();
    }
}
