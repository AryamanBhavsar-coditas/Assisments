package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class OperationBank {
    static BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aryaman");


    public static void create() throws IOException {

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        System.out.println("Enter Name:");
        String name = sc.readLine();

        Bank bank = new Bank();
        bank.setName(name);

        entityManager.getTransaction().begin();

        entityManager.persist(bank);

        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public static void Retrieve(){

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Bank> banks = entityManager.createQuery("Select b from Bank b",Bank.class).getResultList();

        entityManager.getTransaction().commit();

        for(Bank b:banks){

            System.out.println("ID:"+b.getId());
            System.out.println("NAME:" + b.getName());
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

        Bank bank = entityManager.find(Bank.class,id);
        bank.setName(name);
        entityManager.merge(bank);

        entityManager.getTransaction().commit();
        entityManager.close();

    }

    public static void Delete() throws IOException {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Enter ID:");
        int id = Integer.parseInt(sc.readLine());

        entityManager.getTransaction().begin();

        Bank bank = entityManager.find(Bank.class,id);
        entityManager.remove(bank);

        entityManager.getTransaction().commit();

        entityManager.close();
    }
}
