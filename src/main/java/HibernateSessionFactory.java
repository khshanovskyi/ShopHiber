import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

//This class one for project. Here we created SessionFactory obj after do initial configuration for this obj after
// that we can call this SessionFactory obj by getSessionFactory() method in other places indoors the project;
public class HibernateSessionFactory {

//    private static SessionFactory sessionFactory = buildSessionFactory();
//
//    protected  static  SessionFactory buildSessionFactory(){
//        final StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
//                .configure()
//                .build();
//        try{
//            sessionFactory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
//        }catch (Exception e){
//            StandardServiceRegistryBuilder.destroy(serviceRegistry);
//            throw new ExceptionInInitializerError("Initial SessionFactory error! " + e);
//        }
//        return  sessionFactory;
//    }
//
//    public  static SessionFactory getSessionFactory(){
//        return sessionFactory;
//    }
//
//    public static void shutDownSessionFactory(){
//        getSessionFactory().close();
//    }

}
