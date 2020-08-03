package dao.view.impl;

import dao.view.FullProductsInfoViewDao;
import entity.ProductEntity;
import entity.view.FullProductsInfoView;
import org.hibernate.Session;
import org.hibernate.query.Query;
import utils.HibernateSessionFactoryUtil;

import java.util.List;
import java.util.Optional;

public class FullProductsInfoViewDaoImpl implements FullProductsInfoViewDao {

    private Session session;

    public List<FullProductsInfoView> getFullProductsViewList() {
        openSession();
        List<FullProductsInfoView> infoViewList = session.createQuery("from FullProductsInfoView order by productName").getResultList();
        closeSession();
        return infoViewList;
    }

    @Override
    public List<FullProductsInfoView> getFullProductViewInfoByProductName(String productName) {
        openSession();
        Query<FullProductsInfoView> query = session.createQuery(
                "from FullProductsInfoView where productName =:productName",FullProductsInfoView.class);
        query.setParameter("productName", productName);
        List<FullProductsInfoView> infoViewList = query.getResultList();
        closeSession();
        return infoViewList;
    }

    @Override
    public List<FullProductsInfoView> getFullProductViewInfoByProductArticle(int productArticle) {
        openSession();
        Query<FullProductsInfoView> query = session.createQuery(
                "from FullProductsInfoView where article =:productArticle");
        query.setParameter("productArticle", productArticle);
        List<FullProductsInfoView> infoViewList = query.getResultList();
        closeSession();
        return infoViewList;
    }

    @Override
    public List<FullProductsInfoView> getFullProductViewInfoWhereNameLike(String productName) {
        openSession();
        Query<FullProductsInfoView> query = session.createQuery(
                "from FullProductsInfoView where productName like'%" + productName + "%'");
        List<FullProductsInfoView> infoViewsList = query.getResultList();
        closeSession();
        return infoViewsList;
    }

    @Override
    public Optional<ProductEntity> getProductByNameAndSizeUk(String productName, double sizeUk) {
        return Optional.empty();
    }

    @Override
    public Optional<ProductEntity> getProductByNameAndSizeEur(String productName, double sizeEur) {
        return Optional.empty();
    }

    @Override
    public Optional<ProductEntity> getProductByArticleAndSizeEur(int article, double sizeEur) {
        return Optional.empty();
    }

    @Override
    public Optional<ProductEntity> getProductByArticleAndSizeUk(int article, double sizeUk) {
        return Optional.empty();
    }

    private void openSession(){
        session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
    }

    private void closeSession(){
        session.close();
    }
}
