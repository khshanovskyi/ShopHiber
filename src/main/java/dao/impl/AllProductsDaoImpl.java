package dao.impl;

import dao.AllProductsDao;
import entity.AllProductsEntity;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class AllProductsDaoImpl implements AllProductsDao {


    public List<AllProductsEntity> getAllProductsList() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        return session.createQuery("from AllProductsEntity ").getResultList();
    }

    public AllProductsEntity getProductByArticle(int article) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(AllProductsEntity.class,article);
    }

    public AllProductsEntity getProductByFullName(String productName) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(AllProductsEntity.class,productName);
    }

    public List<AllProductsEntity> getListProductsWhereNameLike(String nameLike) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        return session.createQuery("select p from AllProductsEntity p where productName like '%" + nameLike + "%'").getResultList();
    }

    public List<AllProductsEntity> getAllProductsListSortedByName() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        return session.createQuery("from AllProductsEntity order by productName").getResultList();
    }

    public List<AllProductsEntity> getAllProductsListSortedByBrend() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        return session.createQuery("from AllProductsEntity order by brend").getResultList();
    }

    public List<AllProductsEntity> getAllProductsListSortedByType() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        return session.createQuery("from AllProductsEntity order by type").getResultList();
    }

    public List<AllProductsEntity> getAllProductsListSortedByCategory() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        return session.createQuery("from AllProductsEntity order by category").getResultList();
    }

    public List<AllProductsEntity> getAllProductsListSortedByPriceFromCheapToExpensive() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        return session.createQuery("from AllProductsEntity order by price").getResultList();
    }

    public List<AllProductsEntity> getAllProductsListSortedByPriceFromExpensiveToCheap() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        return session.createQuery("from AllProductsEntity order by price desc ").getResultList();
    }
}
