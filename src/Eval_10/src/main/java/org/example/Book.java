package org.example;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int BookPrice;
    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne
    private Author author;

    @OneToOne
    private Publisher publisher;


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Book(){
    }

    public Book(int id, String name, int bookPrice, Author author, Publisher publisher) {
        this.id = id;
        this.name = name;
        BookPrice = bookPrice;
        this.author = author;
        this.publisher = publisher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBookPrice() {
        return BookPrice;
    }

    public void setBookPrice(int bookPrice) {
        BookPrice = bookPrice;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", BookPrice=" + BookPrice +
                ", author=" + author +
                ", publisher=" + publisher +
                '}';
    }
}
