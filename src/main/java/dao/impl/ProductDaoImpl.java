package dao.impl;

import dao.ProductDao;
import entity.ProductEntity;
import org.hibernate.Session;
import org.hibernate.query.Query;
import utils.HibernateSessionFactoryUtil;

import java.util.List;
import java.util.Optional;

public class ProductDaoImpl implements ProductDao {

    private Session session;

    @Override
    public List<ProductEntity> getProductList() {
        openSession();
        List<ProductEntity> productEntities = session.createQuery("from ProductEntity").getResultList();
        closeSession();
        return productEntities;
    }

    @Override
    public Optional<ProductEntity> getProductById(int prodId) {
        openSession();
        Optional<ProductEntity> productEntity = Optional.of(session.get(ProductEntity.class, prodId));
        closeSession();
        return productEntity;
    }

    @Override
    public Optional<ProductEntity> getProductByName(String name) {
        openSession();
        Query<ProductEntity> query = session.createQuery("from ProductEntity where productName = :name");
        query.setParameter("name", name);
        Optional<ProductEntity> productEntity = Optional.of(query.getSingleResult());
        closeSession();
        return productEntity;
    }

    @Override
    public void createProduct(ProductEntity productEntity) {
        openSession();
        session.beginTransaction();
        session.save(productEntity);
        session.getTransaction().commit();
        closeSession();
    }




    private void openSession() { session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
    }

    private void closeSession() { session.close();
    }
}