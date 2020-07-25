package dao.view.impl;

import dao.view.FullProductsInfoViewDao;
import entity.view.FullProductsInfoView;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class FullProductsInfoViewDaoImpl implements FullProductsInfoViewDao {

    public List<FullProductsInfoView> getFullProductsViewList() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        return session.createQuery("from FullProductsInfoView").getResultList();
    }
}
