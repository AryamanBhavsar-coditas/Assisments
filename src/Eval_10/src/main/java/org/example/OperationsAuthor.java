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

public class OperationsAuthor {
    static Configuration configuration = new Configuration().configure();
    static SessionFactory sessionFactory = configuration.buildSessionFactory();
    static BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    public static void create() throws IOException {

        System.out.println("Enter Author Name:");
        String name = sc.readLine();

        Author author = new Author();
        author.setName(name);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(author);

        transaction.commit();

        session.close();

        System.out.println("Author Added Sucessfully!");
    }

    public static void Select() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        List<Author> authors = new ArrayList<Author>();

        try {
            Query query = session.createQuery("from Author");
            authors = query.getResultList();

            Iterator iterator = authors.listIterator();
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

        System.out.println("Enter Author ID:");
        int id = Integer.parseInt(sc.readLine());
        System.out.println("Enter Updated => (name)(book_id)");
        String change = sc.readLine();
        int bid = Integer.parseInt(sc.readLine());

        Book book = session.get(Book.class,bid);
        List<Book> books = new ArrayList<>();
        books.add(book);


        Author author = session.get(Author.class,id);
        author.setName(change);
        author.setBooks(books);
        book.setAuthor(author);

        session.saveOrUpdate(author);
        session.saveOrUpdate(book);

        transaction.commit();
        session.close();

        System.out.println("Updated SucessFully!");

    }

    public static void Delete() throws IOException {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();


        System.out.println("Enter Author ID:");
        int id = Integer.parseInt(sc.readLine());

        Author author = session.get(Author.class,id);

        session.delete(author);

        transaction.commit();

        session.close();
    }


}
