package dao.impl;

import dao.SizeProductDao;
import entity.SizeProductQuantityEntity;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtil;

import org.hibernate.query.Query;
import java.util.Optional;

public class SizeProductDaoImpl implements SizeProductDao {

    private Session session;

    @Override
    public Optional<SizeProductQuantityEntity> getSizeProductQuantityEntity(int prodArticle, int sizeId) {
        openSession();
        Query<SizeProductQuantityEntity> query = session.createQuery(
                "from SizeProductQuantityEntity where productId = :prodArticle and sizeId = :sizeId", SizeProductQuantityEntity.class);
        query = query.setParameter("prodArticle", prodArticle);
        query = query.setParameter("sizeId", sizeId);
        Optional<SizeProductQuantityEntity> entity = query.uniqueResultOptional();
        closeSession();
        return entity;
    }

    @Override
    public void createSizeProductQuantity(SizeProductQuantityEntity sizeProduct) {
        openSession();
        session.beginTransaction();
        session.save(sizeProduct);
        session.getTransaction().commit();
        closeSession();
    }

    @Override
    public void updateSizeProductQuantity(SizeProductQuantityEntity sizeProduct) {
        openSession();
        session.beginTransaction();
        session.update(sizeProduct);
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
