package geekbrains.hibernate.lesson_1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Catalog.class)
                .addAnnotatedClass(Author.class)
                .addAnnotatedClass(Book.class)
                .addAnnotatedClass(Reader.class)
                .buildSessionFactory();

        // CRUD
        Session session = null;

        try {

//            session = sessionFactory.getCurrentSession();
//            Author author = new Author();
//            author.setName("Rowling");
//            session.beginTransaction();
//            session.save(author);
//            session.getTransaction().commit();

            // CREATE
//            session = sessionFactory.getCurrentSession();
//            Catalog catalog = new Catalog("Fantasy #15");
//            session.beginTransaction();
//            session.save(catalog);
//            session.getTransaction().commit();
            
            //READ
//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//            Catalog catalog2 = session.get(Catalog.class, 2L);
//            session.getTransaction().commit();
//            System.out.println(catalog2);

            //UPDATE
//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//            Catalog catalog = session.get(Catalog.class, 2L);
//            catalog.setTitle("Fantasy #10");
//            session.getTransaction().commit();
//            System.out.println(catalog);\





        } finally {
            sessionFactory.close();
            session.close();
        }


    }
}
