package com.rajithk.hiberante;

import com.rajithk.hibernate.dto.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateMain {

    private static SessionFactory sessionFactory;
    private static ServiceRegistry registry;
    private static StandardServiceRegistry standardServiceRegistry;

    public static void main(String[] args) {


        UserDetails userDetails = new UserDetails();
        userDetails.setUserId(5);
        userDetails.setUserName("Rajith weerasighe");

        standardServiceRegistry = new StandardServiceRegistryBuilder()
                .configure()
                .build();

        MetadataSources metadataSources = new MetadataSources(standardServiceRegistry);

        Metadata metadata = metadataSources.getMetadataBuilder().build();

        sessionFactory = metadata.getSessionFactoryBuilder().build();

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(userDetails);

        session.getTransaction().commit();

        StandardServiceRegistryBuilder.destroy(standardServiceRegistry);
    }
}
