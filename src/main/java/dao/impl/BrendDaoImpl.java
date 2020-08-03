package dao.impl;

import dao.BrendDao;
import entity.BrendEntity;
import org.hibernate.Session;
import org.hibernate.query.Query;
import utils.HibernateSessionFactoryUtil;

import java.util.List;
import java.util.Optional;

public class BrendDaoImpl  implements BrendDao {

    private Session session;

    public List<BrendEntity> getBrendsList() {
        openSession();
        List<BrendEntity> brendEntities = session.createQuery("from BrendEntity order by name").getResultList();
        closeSession();
        return brendEntities;
    }

    @Override
    public List<BrendEntity> getBrendWhereNameLike(String brendName) {
        openSession();
        List<BrendEntity> brendEntities = session.createQuery("select b from BrendEntity b where name like '%"
                + brendName + "%'").getResultList();
        closeSession();
        return brendEntities;
    }

    public Optional<BrendEntity> getBrendById(int brendId) {
        openSession();
        Optional<BrendEntity> brendEntity = Optional.of(session.get(BrendEntity.class, brendId));
        closeSession();
        return brendEntity;
    }

    public Optional<BrendEntity> getBrendByName(String brendName) {
        openSession();
        Query<BrendEntity> query = session.createQuery("from BrendEntity where name = :brendName",BrendEntity.class);
        query.setParameter("brendName",brendName);
        Optional<BrendEntity> brendEntity = Optional.of(query.getSingleResult());
        closeSession();
        return brendEntity;
    }

    public void createBrend(BrendEntity brendEntity) {
        openSession();
        session.beginTransaction();
        session.save(brendEntity);
        session.getTransaction().commit();
        closeSession();
    }

    public void updateBrend(BrendEntity brendEntity) {
        openSession();
        session.beginTransaction();
        session.update(brendEntity);
        session.getTransaction().commit();
        closeSession();
    }

    public void deleteBrend(BrendEntity brendEntity) {
        openSession();
        session.beginTransaction();
        session.delete(brendEntity);
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
