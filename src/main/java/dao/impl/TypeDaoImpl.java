package dao.impl;

import dao.TypeDao;
import entity.TypeEntity;
import org.hibernate.Session;
import org.hibernate.query.Query;
import utils.HibernateSessionFactoryUtil;

import java.util.List;
import java.util.Optional;

public class TypeDaoImpl implements TypeDao {

    private  Session session;

    @Override
    public List<TypeEntity> getTypesList() {
        openSession();
        List<TypeEntity> typeEntities = session.createQuery("from TypeEntity order by name").getResultList();
        closeSession();
        return typeEntities;
    }

    @Override
    public List<TypeEntity> getTypeWhereNameLike(String typeName) {
        openSession();
        List<TypeEntity> typeEntities = session.createQuery("select t from TypeEntity t where name like '%"
                + typeName + "%'").getResultList();
        closeSession();
        return typeEntities;
    }

    @Override
    public Optional<TypeEntity> getTypeById(int typeId) {
        openSession();
        Optional<TypeEntity> typeEntity = Optional.of(session.get(TypeEntity.class, typeId));
        closeSession();
        return typeEntity;
    }

    @Override
    public Optional<TypeEntity> getTypeByName(String typeName) {
        openSession();
        Query<TypeEntity> query = session.createQuery("from TypeEntity where name = :typeName",TypeEntity.class);
        query.setParameter("typeName",typeName);
        Optional<TypeEntity> typeEntity = Optional.of(query.getSingleResult());
        closeSession();
        return typeEntity;
    }

    @Override
    public void createType(TypeEntity typeEntity) {
        openSession();
        session.beginTransaction();
        session.save(typeEntity);
        session.getTransaction().commit();
        closeSession();
    }

    @Override
    public void updateType(TypeEntity typeEntity) {
        openSession();
        session.beginTransaction();
        session.update(typeEntity);
        session.getTransaction().commit();
        closeSession();
    }

    @Override
    public void deleteType(TypeEntity typeEntity) {
        openSession();
        session.beginTransaction();
        session.delete(typeEntity);
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
