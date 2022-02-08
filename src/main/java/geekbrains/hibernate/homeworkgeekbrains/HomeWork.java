package geekbrains.hibernate.homeworkgeekbrains;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(OrderKey.class)
                .addAnnotatedClass(Order.class)
                .buildSessionFactory();

        Session session = null;

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter command: ");

            while (sc.hasNext()) {
                String command = sc.nextLine().toLowerCase();
                if (command.equals("exit")) {
                    break;
                }
                String[] commandParts = command.split(" ");

                switch (commandParts[0]) {
                    case "/buy":
                    case "/showProductsByPerson":
                        session = factory.getCurrentSession();
                        session.beginTransaction();



                        session.getTransaction().commit();
                        System.out.print("Enter new command: ");
                    case "/findPersonsByProductTitle":
                    case "/removePerson":
                    case "/removeProduct":

                }
            }


        } finally {
            factory.close();
            session.close();
        }


    }
}
