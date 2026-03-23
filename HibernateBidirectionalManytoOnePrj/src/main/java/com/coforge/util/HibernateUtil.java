package com.coforge.util;
 
import java.io.InputStream;
import java.util.Properties;
 
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
 
import com.coforge.entities.Author;
import com.coforge.entities.Book;
 
public class HibernateUtil {
 
    private static final SessionFactory sessionFactory = buildSessionFactory();
 
    private static SessionFactory buildSessionFactory() {
        try {
            Properties properties = new Properties();
            InputStream inputStream =
                    HibernateUtil.class
                            .getClassLoader()
                            .getResourceAsStream("application.properties");
 
            if (inputStream == null) {
                throw new RuntimeException("application.properties not found");
            }
 
            properties.load(inputStream);
 
            Configuration configuration = new Configuration();
            configuration.setProperties(properties);
            configuration.addAnnotatedClass(Author.class);
            configuration.addAnnotatedClass(Book.class);
 
            StandardServiceRegistry registry =
                    new StandardServiceRegistryBuilder()
                            .applySettings(configuration.getProperties())
                            .build();
 
            return configuration.buildSessionFactory(registry);
 
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
 