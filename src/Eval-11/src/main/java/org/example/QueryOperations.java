package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.List;

public class QueryOperations {

    static BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aryaman");

    public static void Query1(){
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Account> query = cb.createQuery(Account.class);

        // Set the root entity and add a condition to fetch users that have opened their account on or before 01/01/2023
        Root<Account> userRoot = query.from(Account.class);
        query.where(cb.lessThanOrEqualTo(userRoot.get("date"), Date.from(LocalDate.of(2023, 1, 1).atStartOfDay(ZoneId.systemDefault()).toInstant())));

        // Execute the query and get the results
        List<Account> accountList = entityManager.createQuery(query).getResultList();

        // Close the EntityManager and EntityManagerFactory
        entityManager.close();

        int total = 0;

        for(Account a:accountList){
            System.out.println("ID:"+a.getId());
            System.out.println("DATE:"+a.getDate());
            System.out.println("---------------------------");
            total = total+1;
        }
        System.out.println();
        System.out.println("Total records:"+total);
    }

    public static void Query2(){
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaUpdate<Account> update = cb.createCriteriaUpdate(Account.class);


        Root<Account> accountRoot = update.from(Account.class);
        update.set("priv", "prime");
        update.where(
                cb.and(
                        cb.greaterThan(accountRoot.get("balance"), 100000),
                        cb.lessThanOrEqualTo(accountRoot.get("date"), getThreeMonthsAgo())
                )
        );



        int numUpdated = entityManager.createQuery(update).executeUpdate();

        System.out.println(numUpdated+" record updated!");
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    private static java.util.Date getThreeMonthsAgo() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, -3);
        return cal.getTime();
    }

    public static void Query3() throws IOException {
       EntityManager entityManager = entityManagerFactory.createEntityManager();
       entityManager.getTransaction().begin();

        System.out.println("How many months pending:");
        int months = Integer.parseInt(sc.readLine());
        int amountcurr = 250*months;
        int amountsav = 150*months;

        String jpql = "UPDATE Account a SET a.balance = a.balance - "+amountcurr+" WHERE a.type = 'current' AND a.balance < 100000";
        String jpql2 = "UPDATE Account a SET a.balance = a.balance - "+amountsav+" WHERE a.type = 'saving' AND a.balance < 10000";


        int updatedRows = entityManager.createQuery(jpql).executeUpdate();
        int updatedRowsSav = entityManager.createQuery(jpql2).executeUpdate();

        System.out.println(updatedRows + updatedRowsSav+ " rows updated.");

        if(updatedRows>0){
            System.out.println("Insufficient Balance!!");
            System.out.println("Rs."+amountcurr+" Deducted!!");
            System.out.println("-----------------------------------");
        }
        if(updatedRowsSav>0){
            System.out.println("Save More!!");
            System.out.println("Rs."+amountsav+" Deducted!!");
            System.out.println("-----------------------------------");
        }

        entityManager.getTransaction().commit();

        entityManager.close();
    }
}
