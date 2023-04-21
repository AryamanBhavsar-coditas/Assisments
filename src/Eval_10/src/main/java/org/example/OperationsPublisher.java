package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OperationsPublisher {
    static Configuration configuration = new Configuration().configure();
    static SessionFactory sessionFactory = configuration.buildSessionFactory();
    static BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    public static void create() throws IOException {

        System.out.println("Enter Publisher Name:");
        String name = sc.readLine();
        System.out.println("Enter Book ID:");
        int bid = Integer.parseInt(sc.readLine());

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Book book = session.get(Book.class,bid);
        Publisher publisher = new Publisher();
        publisher.setName(name);
        publisher.setBook(book);

        session.save(publisher);

        transaction.commit();

        session.close();

        System.out.println("Publisher Added Sucessfully!");
        System.out.println();
    }

    public static void Select() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        List<Publisher> publishers = new ArrayList<Publisher>();

        try {
            Query query = session.createQuery("from Publisher");
            publishers = query.getResultList();

            Iterator iterator = publishers.listIterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
            transaction.commit();
        }
        catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        finally {
            session.close();
        }

    }


    public static void Update() throws IOException {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        System.out.println("Enter Publisher ID:");
        int id = Integer.parseInt(sc.readLine());
        System.out.println("Enter Updated => (name)(book_id)");
        String name = sc.readLine();
        int bid = Integer.parseInt(sc.readLine());

        Book book = session.get(Book.class,bid);

        Publisher publisher = session.get(Publisher.class,id);
        publisher.setName(name);
        publisher.setBook(book);
        book.setPublisher(publisher);

        session.saveOrUpdate(publisher);
        session.saveOrUpdate(book);
        transaction.commit();
        session.close();

        System.out.println("Updated SucessFully!");

    }

    public static void Delete() throws IOException {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        System.out.println("Enter Publisher ID:");
        int id = Integer.parseInt(sc.readLine());

        Publisher publisher = session.get(Publisher.class,id);

        session.delete(publisher);

        transaction.commit();

        session.close();
    }
}
