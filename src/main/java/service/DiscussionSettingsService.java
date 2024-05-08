package service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.DiscussionSettings;
import repo.DiscussionSettingsRepo;

import java.util.List;

@Service
public class DiscussionSettingsService
{
    private final DiscussionSettingsRepo repo;
    @Autowired
    public DiscussionSettingsService(DiscussionSettingsRepo repo)
    {
        this.repo = repo;
    }
    public List<DiscussionSettings> getAllSettings()
    {
        return repo.findAll();
    }

    public DiscussionSettings getSettingsById(ObjectId id)
    {
        return repo.findById(id).orElse(null);
    }

    public void saveSettings(DiscussionSettings settings)
    {
        repo.save(settings);
    }

    public void deleteSettings(ObjectId id)
    {
        repo.deleteById(id);
    }
}
