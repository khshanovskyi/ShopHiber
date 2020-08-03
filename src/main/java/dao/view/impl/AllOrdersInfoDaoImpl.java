package dao.view.impl;

import dao.view.AllOrdersInfoDao;
import entity.view.AllOrdersInfoView;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class AllOrdersInfoDaoImpl implements AllOrdersInfoDao {

    public List<AllOrdersInfoView> getAllOrdersInfoViewList() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        return session.createQuery("from AllOrdersInfoView").getResultList();
    }
}
