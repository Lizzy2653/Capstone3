package org.yearup.data;

import org.yearup.models.Category;

import java.util.List;

public interface CategoryDao
{
    // Category CRUD operations: create, read(get/select), update, delete
    List<Category> getAllCategories();
    Category getById(int categoryId);
    Category create(Category category);
    void update(int categoryId, Category category);
    void delete(int categoryId);
}
