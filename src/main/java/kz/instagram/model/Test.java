package kz.instagram.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;


import javax.imageio.spi.ServiceRegistry;
import java.util.List;

public class Test {
/*
    private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;

    private static void init() {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    }

    private static void destroy() {
        StandardServiceRegistryBuilder.destroy(serviceRegistry);
    }


    public static void main(String[] args) {
      *//*  init();

        Session s = sessionFactory.getCurrentSession();
        s.beginTransaction();
        List<Person> personList = s.createQuery("from Person").list();
        s.getTransaction().commit();

        for (Person p : personList) {
            System.out.print("Person name:" + p.getName());

        }

        destroy();*//*

        SessionFactory sessionFactory = new Configuration().configure()
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
//
//        Person person = new Person("test", "test", "W");
//        session.save(person);
        List<Person> personList = session.createQuery("from Person").list();
        session.getTransaction().commit();

        for (Person p : personList) {
            System.out.println("Person name:" + p.getName());

        }
    //    session.getTransaction().commit();
        session.close();
    }*/
}
