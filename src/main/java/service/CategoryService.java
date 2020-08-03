package service;

import entity.CategoryEntity;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    List<CategoryEntity> getCategoriesList();

    List<CategoryEntity> getCategoriesWhereCategoryLike(String categoryName);

    Optional<CategoryEntity> getCategory(int categoryId);

    Optional<CategoryEntity> getCategory(String categoryName);

    void createCategory(CategoryEntity categoryEntity);
    void createCategory(String name, short discount);
    void createCategory(String name);

    void updateCategory(CategoryEntity categoryEntity);
    void updateCategory(int id, String name, short discount);
    void updateCategory(int id, String name);
    void updateCategory(int id, short discount);

    void deleteCategory(CategoryEntity categoryEntity);
    void deleteCategory(int id);
}
