package utils;

import entity.*;
import entity.view.AllOrdersInfoView;
import entity.view.FullProductsInfoView;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryUtil {

    private static SessionFactory sessionFactory;

    private HibernateSessionFactoryUtil() {
    }

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(FullProductsInfoView.class);
                configuration.addAnnotatedClass(BrendEntity.class);
                configuration.addAnnotatedClass(CategoryEntity.class);
                configuration.addAnnotatedClass(CustomerEntity.class);
                configuration.addAnnotatedClass(OrderEntity.class);
                configuration.addAnnotatedClass(OrderProductEntity.class);
                configuration.addAnnotatedClass(ProductEntity.class);
                configuration.addAnnotatedClass(SizeEntity.class);
                configuration.addAnnotatedClass(SizeProductQuantityEntity.class);
                configuration.addAnnotatedClass(TypeEntity.class);
                configuration.addAnnotatedClass(CollectionEntity.class);
                configuration.addAnnotatedClass(AllOrdersInfoView.class);

                StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(serviceRegistryBuilder.build());
            } catch (Exception e) {
                throw new ExceptionInInitializerError("Initial SessionFactory error! " + e);
            }
        }
        return sessionFactory;
    }
}
