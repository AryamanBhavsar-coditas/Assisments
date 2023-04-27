package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class OperationCustomer {

    static BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aryaman");


    public static void create() throws IOException {

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        System.out.println("Enter Name:");
        String name = sc.readLine();
        System.out.println("Enter Bank ID:");
        int bid = Integer.parseInt(sc.readLine());

        Bank bank = entityManager.find(Bank.class,bid);
        Customer customer = new Customer();
        customer.setName(name);
        customer.setBank(bank);

        entityManager.getTransaction().begin();

        entityManager.persist(customer);

        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public static void Retrieve(){

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Customer> customers = entityManager.createQuery("Select c from Customer c",Customer.class).getResultList();

        entityManager.getTransaction().commit();

        for(Customer c:customers){

            System.out.println("ID:"+c.getId());
            System.out.println("NAME:" + c.getName());
            System.out.println("BANK:" + c.getBank().getName());
            System.out.println("------------------------");
        }
        System.out.println("");

    }

    public static void Update() throws IOException {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Enter ID:");
        int id = Integer.parseInt(sc.readLine());
        System.out.println("Enter Updated Name:");
        String name = sc.readLine();

        entityManager.getTransaction().begin();

        Customer customer = entityManager.find(Customer.class,id);
        customer.setName(name);
        entityManager.merge(customer);

        entityManager.getTransaction().commit();
        entityManager.close();

    }

    public static void Delete() throws IOException {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Enter ID:");
        int id = Integer.parseInt(sc.readLine());

        entityManager.getTransaction().begin();

        Customer customer = entityManager.find(Customer.class,id);
        entityManager.remove(customer);

        entityManager.getTransaction().commit();

        entityManager.close();
    }

}
