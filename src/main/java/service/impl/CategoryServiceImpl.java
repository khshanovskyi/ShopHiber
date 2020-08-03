package service.impl;

import dao.CategoryDao;
import dao.impl.CategoryDaoImpl;
import entity.CategoryEntity;
import service.CategoryService;

import java.util.List;
import java.util.Optional;

public class CategoryServiceImpl implements CategoryService {

    private final CategoryDao categoryDao;

    public CategoryServiceImpl() { categoryDao = new CategoryDaoImpl(); }


    @Override
    public List<CategoryEntity> getCategoriesList() {
        return categoryDao.getCategoriesList();
    }


    @Override
    public List<CategoryEntity> getCategoriesWhereCategoryLike(String categoryName) {
        return categoryDao.getCategoriesListWhereCategoryLike(categoryName);
    }


    @Override
    public Optional<CategoryEntity> getCategory(int categoryId) {
        return categoryDao.getCategoryById(categoryId);
    }


    @Override
    public Optional<CategoryEntity> getCategory(String categoryName) {
        return categoryDao.getCategoryByName(categoryName);
    }


    @Override
    public void createCategory(CategoryEntity categoryEntity) {
        categoryDao.createCategory(categoryEntity);
    }
    @Override
    public void createCategory(String name, short discount) {
        categoryDao.createCategory(createCategoryEntity(name, discount));
    }
    @Override
    public void createCategory(String name) {
        categoryDao.createCategory(createCategoryEntity(name));
    }


    @Override
    public void updateCategory(CategoryEntity categoryEntity) {
        categoryDao.updateCategory(categoryEntity);
    }
    @Override
    public void updateCategory(int id, String name, short discount) {
        if (categoryDao.getCategoryById(id).isPresent()){
            categoryDao.updateCategory(createCategoryEntity(id,name,discount));
        }
    }
    @Override
    public void updateCategory(int id, String name) {
        Optional<CategoryEntity> oldCategoryEntity = categoryDao.getCategoryById(id);
        oldCategoryEntity.ifPresent(categoryEntity -> categoryDao.updateCategory(createCategoryEntity(id,name,categoryEntity.getDiscount())));
    }
    @Override
    public void updateCategory(int id, short discount) {
        Optional<CategoryEntity> oldCategoryEntity = categoryDao.getCategoryById(id);
        oldCategoryEntity.ifPresent(categoryEntity -> categoryDao.updateCategory(createCategoryEntity(id,categoryEntity.getName(),discount)));
    }


    @Override
    public void deleteCategory(CategoryEntity categoryEntity) {
        categoryDao.deleteCategory(categoryEntity);
    }
    @Override
    public void deleteCategory(int id) {
        Optional<CategoryEntity> oldCategoryEntity = categoryDao.getCategoryById(id);
        oldCategoryEntity.ifPresent(categoryDao :: deleteCategory);
    }

    private CategoryEntity createCategoryEntity(String name){
        return CategoryEntity.builder().name(name).build();
    }

    private CategoryEntity createCategoryEntity(String name, short discount){
        return CategoryEntity.builder().name(name).discount(discount).build();
    }

    private CategoryEntity createCategoryEntity(int id, String name, short discount){
        return CategoryEntity.builder().id(id).name(name).discount(discount).build();
    }
}
