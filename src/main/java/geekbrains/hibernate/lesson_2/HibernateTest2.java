package geekbrains.hibernate.lesson_2;
;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.OptimisticLockException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Collectors;

public class HibernateTest2 {

    private static final int NUMBER_OF_THREADS = 8;
    private static final int NUMBER_OF_COUNT_ITERATIONS = 100;

    public static void main(String[] args) throws IOException {

        long time = System.currentTimeMillis();
        prepareData();
        increaseValWithEightThreads();
        System.out.println("time " + (System.currentTimeMillis() - time));
        countOfSum();

    }

    public static void prepareData() throws IOException {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
        Session session = null;
        try {
            String sql = Files.lines(Paths.get("./src/main/resources/script.sql")).collect(Collectors.joining());
            session = factory.getCurrentSession();
            session.beginTransaction();
            session.createNativeQuery(sql).executeUpdate();
//            session.beginTransaction().commit();
        } finally {
            factory.close();
            if (session != null) {
                session.close();
            }
        }
    }

    public static void uncheckableSleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void increaseValWithEightThreads() {
        CountDownLatch countDownLatch = new CountDownLatch(NUMBER_OF_THREADS);
        Thread[] threads = new Thread[NUMBER_OF_THREADS];

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory()) {
            for (int i = 0; i < NUMBER_OF_THREADS; i++) {
                final int u = i;
                threads[i] = new Thread(() -> {
                    System.out.println("Thread- " + u + " started");
                    for (int j = 0; j < NUMBER_OF_COUNT_ITERATIONS; j++) {
                        boolean updated = false;
                        Long randomRow = (long) (Math.random() * 39) + 1;
                        while (!updated) {
                            Session session = factory.getCurrentSession();
                            session.beginTransaction();
                            Item item = session.get(Item.class, randomRow);
                            int tmp = item.getVal();
                            item.setVal(++tmp);
                            uncheckableSleep(5);
                            try {
                                session.save(item);
                                session.getTransaction().commit();
                                updated = true;
                            } catch (OptimisticLockException e) {
                                session.getTransaction().rollback();
                            }
                            if (session != null) {
                                session.close();
                            }
                        }
                    }
                    countDownLatch.countDown();
                });
                threads[i].start();
            }
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void countOfSum() {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            Object o = session.createNativeQuery("SELECT SUM(val) FROM items;").getSingleResult();
            System.out.println(o);
            if (session != null) {
                session.close();
            }
        }
    }
}
