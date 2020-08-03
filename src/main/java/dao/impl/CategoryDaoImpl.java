package dao.impl;

import dao.CategoryDao;
import entity.BrendEntity;
import entity.CategoryEntity;
import org.hibernate.Session;
import org.hibernate.annotations.OrderBy;
import org.hibernate.annotations.SortNatural;
import org.hibernate.query.Query;
import utils.HibernateSessionFactoryUtil;

import java.util.List;
import java.util.Optional;

public class CategoryDaoImpl implements CategoryDao {

    private Session session;

    @Override
    public List<CategoryEntity> getCategoriesList() {
        openSession();
        List<CategoryEntity> categoryEntities = session.createQuery("from CategoryEntity order by name").getResultList();
        closeSession();
        return categoryEntities;
    }

    @Override
    public List<CategoryEntity> getCategoriesListWhereCategoryLike(String categoryName) {
        openSession();
        List<CategoryEntity> categoryEntities = session.createQuery("from CategoryEntity where name = '%" + categoryName + "%'")
                .getResultList();
        closeSession();
        return categoryEntities;
    }

    @Override
    public Optional<CategoryEntity> getCategoryById(int id) {
        openSession();
        Optional<CategoryEntity> brendEntity = Optional.of(session.get(CategoryEntity.class, id));
        closeSession();
        return brendEntity;
    }

    @Override
    public Optional<CategoryEntity> getCategoryByName(String categoryName) {
        openSession();
        Query<CategoryEntity> query = session.createQuery("from CategoryEntity where name = :categoryName", CategoryEntity.class);
        query.setParameter("categoryName", categoryName);
        Optional<CategoryEntity> categoryEntity = Optional.of(query.getSingleResult());
        closeSession();
        return categoryEntity;
    }

    @Override
    public void createCategory(CategoryEntity categoryEntity) {
        openSession();
        session.beginTransaction();
        session.save(categoryEntity);
        session.getTransaction().commit();
        closeSession();
    }

    @Override
    public void updateCategory(CategoryEntity categoryEntity) {
        openSession();
        session.beginTransaction();
        session.update(categoryEntity);
        session.getTransaction().commit();
        closeSession();
    }

    @Override
    public void deleteCategory(CategoryEntity categoryEntity) {
        openSession();
        session.beginTransaction();
        session.delete(categoryEntity);
        session.getTransaction().commit();
        closeSession();
    }

    private void openSession(){
        session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
    }

    private void closeSession(){
        session.close();
    }
}
