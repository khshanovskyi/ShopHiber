package dao;

import entity.CategoryEntity;

import java.util.List;
import java.util.Optional;

public interface CategoryDao {

    List<CategoryEntity> getCategoriesList();

    List<CategoryEntity> getCategoriesListWhereCategoryLike(String categoryName);

    Optional<CategoryEntity> getCategoryById(int id);

    Optional<CategoryEntity> getCategoryByName(String categoryName);

    void createCategory(CategoryEntity categoryEntity);

    void updateCategory(CategoryEntity categoryEntity);

    void deleteCategory(CategoryEntity categoryEntity);
}
