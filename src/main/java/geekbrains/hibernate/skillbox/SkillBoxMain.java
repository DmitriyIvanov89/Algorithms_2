package geekbrains.hibernate.skillbox;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class SkillBoxMain {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(Order.class)
                .addAnnotatedClass(OrderId.class)
                .buildSessionFactory();

        Session session = null;

        try {

            // create new Order
//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//            Person person = (Person) session.createQuery("FROM Person p WHERE p.id = :id").setParameter("id", 1L).uniqueResult();
//            Product product = (Product) session.createQuery("FROM Product p WHERE p.id = :id").setParameter("id", 5L).uniqueResult();
//
//            OrderId orderId = new OrderId();
//            orderId.setPersonId(person.getId());
//            orderId.setProductId(product.getId());
//            Order order = new Order();
//            order.setOrderId(orderId);
//            order.setPrice(product.getPrice());
//
//            session.save(order);
//            session.getTransaction().commit();
//
//            System.out.println("Create new order: " + order.toString());
            // ShowProductsByPerson
//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//            Person person = (Person) session.createQuery("FROM Person p WHERE p.id = :id").setParameter("id", 1L).uniqueResult();
//            List<Order> orders = person.getOrders();
//            for (Order order : orders) {
//                System.out.println(order);
//            }



        } finally {
            session.close();
            sessionFactory.close();
        }

    }
}

