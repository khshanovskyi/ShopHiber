import dao.AllProductsDao;
import dao.impl.AllProductsDaoImpl;
import entity.AllProductsEntity;
import entity.ProductEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.query.Query;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class AppMain {
    private static Logger logger = LogManager.getLogger();



    public static void main(String[] args) {
        logger.warn("main started");
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();

        Query query = session.createQuery("from AllProductsEntity order by productName");
        List<AllProductsEntity> productEntities = query.list();

        for (AllProductsEntity productEntity: productEntities
             ) {
            System.out.println("Product article = " + productEntity.getArticle() +
                    "; Product name = " + productEntity.getProductName());
        }

        query = session.createQuery("from ProductEntity ");
        List<ProductEntity> productEntityList = query.list();
        for (ProductEntity product: productEntityList
             ) {
            System.out.println(product.getTypeEntity().toString());
        }

        AllProductsDao allProductsDao = new AllProductsDaoImpl();
        AllProductsEntity productEntity = allProductsDao.getProductByArticle(17552);
        System.out.println(productEntity.toString());

        System.out.println("/////////////////////");

        List<AllProductsEntity> allProductsEntityList = allProductsDao.getListProductsWhereNameLike("Nike");
        if (!allProductsEntityList.isEmpty()){
            for (AllProductsEntity entity: allProductsEntityList
                 ) {
                System.out.println(entity.toString());
            }
        }else {
            System.out.println("We cannot find what you want. Please, try again with another searching request.");
        }

        logger.warn("main finished");
        session.close();
    }
}
