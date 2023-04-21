package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OperationsBook {
    static Configuration configuration = new Configuration().configure();
    static SessionFactory sessionFactory = configuration.buildSessionFactory();
    static BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    public static void create() throws IOException, ParseException {

        System.out.println("Enter Book Name:");
        String name = sc.readLine();
        System.out.println("Enter Book Price:");
        int price = Integer.parseInt(sc.readLine());
        System.out.println("Enter Author ID:");
        int aid = Integer.parseInt(sc.readLine());
        System.out.println("Enter Publisher ID:");
        int pid = Integer.parseInt(sc.readLine());

       // System.out.print("Enter the date (yyyy-MM-dd): ");
//        String dateString = sc.readLine();

//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = dateFormat.parse(dateString);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Author author = session.get(Author.class,aid);
        Publisher publisher = session.get(Publisher.class,pid);

        Book book = new Book();
        book.setName(name);
        book.setBookPrice(price);
        book.setAuthor(author);
        book.setPublisher(publisher);
        book.setDate(new Date());

        session.save(book);

        transaction.commit();

        session.close();

        System.out.println("Book Added Sucessfully!");
    }

    public static void Select() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        List<Book> books = new ArrayList<Book>();

        try {
            Query query = session.createQuery("from Book");
            books = query.getResultList();

            Iterator iterator = books.listIterator();
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

        System.out.println("Enter Book ID:");
        int id = Integer.parseInt(sc.readLine());
        System.out.println("Enter Updated => (name,price)");
        String name = sc.readLine();
        int price = Integer.parseInt(sc.readLine());

        Book book = session.get(Book.class,id);
        book.setName(name);
        book.setBookPrice(price);

        session.saveOrUpdate(book);
        transaction.commit();
        session.close();

        System.out.println("Updated SucessFully!");

    }

    public static void Delete() throws IOException {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();


        System.out.println("Enter Book ID:");
        int id = Integer.parseInt(sc.readLine());

        Book book = session.get(Book.class,id);

        session.delete(book);

        transaction.commit();

        session.close();
    }

}
