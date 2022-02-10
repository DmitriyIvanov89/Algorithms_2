package geekbrains.hibernate.skillbox;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SkillBoxMain {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().
                configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Product.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            READ
//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//            Person person = session.get(Person.class, 1);
//            session.getTransaction().commit();
//            System.out.println(person.toString());
//            CREATE
//            session = sessionFactory.getCurrentSession();
//            Person person = new Person("Person_7");
//            session.beginTransaction();
//            session.save(person);
//            session.getTransaction().commit();
//            UPDATE
//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//            Person person = session.get(Person.class, 7);
//            person.setName("Person_7");
//            session.getTransaction().commit();
//            DELETE
//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//            Person person = session.get(Person.class, 7);
//            session.delete(person);
//            session.getTransaction().commit();

        } finally {
            session.close();
            sessionFactory.close();
        }

    }
}
