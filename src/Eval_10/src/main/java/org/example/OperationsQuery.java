package org.example;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class OperationsQuery {

    static org.hibernate.cfg.Configuration configuration = new Configuration().configure();
    static SessionFactory sessionFactory = configuration.buildSessionFactory();

    public static void Query2(){
        // Get a Hibernate session
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();

// Create a Hibernate Query to find all books by Nirali publication with price >= 500
        Query<Book> query = session.createQuery("SELECT b FROM Book b JOIN b.publisher p WHERE p.name = :name AND b.BookPrice >= :price", Book.class);
        query.setParameter("name", "Nirali");
        query.setParameter("price", 500);

// Execute the query and get the result list
        List<Book> books = query.getResultList();

// Print the books
        for (Book book : books) {
            System.out.println("Book Name:"+book.getName()+"  "+"Publication:"+book.getPublisher().getName()+"  "+"Price: "+book.getBookPrice());
        }

        transaction.commit();
        session.close();

    }

    public static void Query3(){
        // Get a Hibernate session
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();

// Create a Hibernate Query to find all books of authors whose name starts with "A" and ends with "I"
        Query<Book> query = session.createQuery("SELECT b FROM Book b JOIN b.author a WHERE a.name LIKE 'a%i'", Book.class);

// Execute the query and get the result list
        List<Book> books = query.getResultList();

// Print the books
        for (Book book : books) {
            System.out.println(book.getName()+"  "+ book.getAuthor().getName());
        }

        transaction.commit();
        session.close();

    }

    public static void Query1() throws ParseException {
        // Get a Hibernate session
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        String dateString = "2021-01-01";

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //Date date = dateFormat.parse(dateString);

// Create a Hibernate Query to find all authors who have published their book on or before 2021-01-01
        java.sql.Date date = java.sql.Date.valueOf(LocalDate.parse("2021-01-01"));
        Query query = session.createQuery("SELECT DISTINCT a FROM Author a JOIN a.books b WHERE b.date >= :date")
                .setParameter("date", date);

// Execute the query and get the result list
        List<Author> authors = query.getResultList();

// Print the authors
        for (Author author : authors) {
            System.out.println(author.getName());
        }

        transaction.commit();
        session.close();
    }

    public static void Query11(){
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        LocalDate date = LocalDate.of(2021, 1, 1);

        Date sqlDate = java.sql.Date.valueOf(date);

        Query query = session.createQuery("FROM Book WHERE date <= :date");
        query.setParameter("date", sqlDate);

        List<Book> bookList = query.getResultList();

        if (bookList.isEmpty()) {
            System.out.println("No books found");
        } else {
            for (Book book : bookList) {

                System.out.println("Author Name: " + book.getAuthor().getName());
            }
        }
        session.close();
    }
}
