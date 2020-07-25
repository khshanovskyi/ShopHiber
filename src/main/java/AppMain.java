import dao.view.FullProductsInfoViewDao;
import dao.view.impl.FullProductsInfoViewDaoImpl;
import entity.view.FullProductsInfoView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class AppMain {
    private static final Logger logger = LogManager.getLogger();



    public static void main(String[] args) {
        logger.warn("main started");
//        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
//
//        Query query = session.createQuery("from AllProductsEntity order by productName");
//        List<AllProductsEntity> productEntities = query.list();
//
//        for (AllProductsEntity productEntity: productEntities
//             ) {
//            System.out.println("Product article = " + productEntity.getArticle() +
//                    "; Product name = " + productEntity.getProductName());
//        }
//
//        query = session.createQuery("from ProductEntity ");
//        List<ProductEntity> productEntityList = query.list();
//        for (ProductEntity product: productEntityList
//             ) {
//            System.out.println(product.getTypeEntity().toString());
//        }

        FullProductsInfoViewDao productsInfoViewDao = new FullProductsInfoViewDaoImpl();
        List<FullProductsInfoView> fullProductsInfoViews = productsInfoViewDao.getFullProductsViewList();
        if (!fullProductsInfoViews.isEmpty()){
            for (FullProductsInfoView infoView: fullProductsInfoViews) {
                System.out.println(infoView.toString());
            }
        }else{
            System.out.println("Full Info Products List is empty");
        }




//        session.close();
    }
}
