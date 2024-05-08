package service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Category;
import repo.CategoryRepo;

import java.util.List;

@Service
public class CategoryService
{
    private final CategoryRepo repo;
    @Autowired
    public CategoryService(CategoryRepo repo)
    {
        this.repo = repo;
    }

    public List<Category> getAllCategories()
    {
        return repo.findAll();
    }

    public Category getCategoryById(ObjectId id)
    {
        return repo.findById(id).orElse(null);
    }

    public void saveCategory(Category category)
    {
        repo.save(category);
    }

    public void deleteCategory(ObjectId id)
    {
        repo.deleteById(id);
    }
}
