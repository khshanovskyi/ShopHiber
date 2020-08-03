package dao.impl;

import dao.CollectionDao;
import entity.CollectionEntity;
import org.hibernate.Session;
import org.hibernate.query.Query;
import utils.HibernateSessionFactoryUtil;

import java.util.List;
import java.util.Optional;

public class CollectionDaoImpl implements CollectionDao {

    private Session session;

    @Override
    public List<CollectionEntity> getCollectionsList() {
        openSession();
        List<CollectionEntity> collectionEntities = session.createQuery("from CollectionEntity order by name").getResultList();
        closeSession();
        return collectionEntities;
    }

    @Override
    public List<CollectionEntity> getCollectionWhereNameLike(String collectionName) {
        openSession();
        List<CollectionEntity> collectionEntities = session.createQuery("select b from CollectionEntity b where name like '%"
                + collectionName + "%'").getResultList();
        closeSession();
        return collectionEntities;
    }

    @Override
    public Optional<CollectionEntity> getCollectionById(int collectionId) {
        openSession();
        Optional<CollectionEntity> collectionEntity = Optional.of(session.get(CollectionEntity.class, collectionId));
        closeSession();
        return collectionEntity;
    }

    @Override
    public Optional<CollectionEntity> getCollectionByName(String collectionName) {
        openSession();
        Query<CollectionEntity> query = session.createQuery("from CollectionEntity where name = :collectionName",CollectionEntity.class);
        query.setParameter("collectionName",collectionName);
        Optional<CollectionEntity> collectionEntity = Optional.of(query.getSingleResult());
        closeSession();
        return collectionEntity;
    }

    @Override
    public void createCollection(CollectionEntity collectionEntity) {
        openSession();
        session.beginTransaction();
        session.save(collectionEntity);
        session.getTransaction().commit();
        closeSession();
    }

    @Override
    public void updateCollection(CollectionEntity collectionEntity) {
        openSession();
        session.beginTransaction();
        session.update(collectionEntity);
        session.getTransaction().commit();
        closeSession();
    }

    @Override
    public void deleteCollection(CollectionEntity collectionEntity) {
        openSession();
        session.beginTransaction();
        session.delete(collectionEntity);
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
