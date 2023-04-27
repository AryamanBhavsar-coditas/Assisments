package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OperationAccount {

    static BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aryaman");


    public static void create() throws IOException {

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        System.out.println("Enter Customer ID:");
        int cid = Integer.parseInt(sc.readLine());
        System.out.println("Enter Account Type:");
        String type = sc.readLine();
        System.out.println("Enter Balance:");
        int bal = Integer.parseInt(sc.readLine());

        String cname="";

        if(type.equalsIgnoreCase("current")){
            System.out.println("Enter Company name:");
            cname = sc.readLine();
        }

        Account account = new Account();
        account.setType(type);
        account.setBalance(bal);
        account.setPriv("Non-Prime");
        account.setCompanyName(cname);
        account.setDate(new Date());

        Customer customer = entityManager.find(Customer.class,cid);
        List<Customer> customers = new ArrayList<Customer>();
        customers.add(customer);

        account.setCustomers(customers);

        entityManager.getTransaction().begin();

        entityManager.persist(account);

        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public static void Retrieve(){

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Account> accounts = entityManager.createQuery("Select a from Account a",Account.class).getResultList();

        entityManager.getTransaction().commit();

        for(Account a:accounts){

            System.out.println("ID:"+a.getId());
            System.out.println("TYPE:" + a.getType());
            System.out.println("BALANCE:" + a.getBalance());
            System.out.println("PRIVILEGE:" + a.getPriv());
            System.out.println("COMPANY NAME:" + a.getCompanyName());
            System.out.println("------------------------");
        }
        System.out.println("");

    }

    public static void Update() throws IOException {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Enter ID:");
        int id = Integer.parseInt(sc.readLine());
        System.out.println("Enter Updated Balance:");
        int bal = Integer.parseInt(sc.readLine());

        entityManager.getTransaction().begin();

        Account account = entityManager.find(Account.class,id);
        account.setBalance(bal);
        entityManager.merge(account);

        entityManager.getTransaction().commit();
        entityManager.close();

    }

    public static void Delete() throws IOException {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Enter ID:");
        int id = Integer.parseInt(sc.readLine());

        entityManager.getTransaction().begin();

        Account account = entityManager.find(Account.class,id);
        entityManager.remove(account);

        entityManager.getTransaction().commit();

        entityManager.close();
    }

}
