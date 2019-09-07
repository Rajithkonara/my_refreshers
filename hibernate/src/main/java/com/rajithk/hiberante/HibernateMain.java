package com.rajithk.hiberante;

import com.rajithk.hibernate.dto.Address;
import com.rajithk.hibernate.dto.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import java.util.Date;

public class HibernateMain {

    private static SessionFactory sessionFactory;
    private static ServiceRegistry registry;
    private static StandardServiceRegistry standardServiceRegistry;

    public static void main(String[] args) {


        UserDetails userDetails = new UserDetails();
        userDetails.setUserName("Rajith weerasighe");

        Address address = new Address();
        address.setStreet("R D Mel");
        address.setCity("Nugegoda");
        address.setState("colarado");
        address.setPinCode("123");

        userDetails.setHomeAddress(address);

        Address address2 = new Address();
        address2.setStreet("colomisd");
        address2.setCity("adasdas");
        address2.setState("colardasdasddo");
        address2.setPinCode("12322");

        userDetails.setOfficeAddress(address2);

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
        session.close();

//        userDetails = null;
//
//        session = sessionFactory.openSession();
//        session.beginTransaction();
//        userDetails = session.get(UserDetails.class, 5);

        StandardServiceRegistryBuilder.destroy(standardServiceRegistry);
    }
}
