package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;

        while (flag){
            System.out.println("0.EXIT");
            System.out.println("1.CREATE");
            System.out.println("2.RETRIEVE");
            System.out.println("3.UPDATE");
            System.out.println("4.DELETE");
            System.out.println("5.QUERY-1");
            System.out.println("6.QUERY-2");
            System.out.println("7.QUERY-3");
            int choice = Integer.parseInt(sc.readLine());

            switch (choice){
                case 0:
                    flag=false;
                    break;

                case 1:
                    boolean flag1 = true;
                    while (flag1){
                        System.out.println("0.EXIT");
                        System.out.println("1.BANK");
                        System.out.println("2.ACCOUNT");
                        System.out.println("3.USER");
                        int choice1 = Integer.parseInt(sc.readLine());

                        switch (choice1){
                            case 0:
                                flag1=false;
                                break;

                            case 1:
                                    OperationBank.create();
                                break;

                            case 2:
                                    OperationAccount.create();
                                break;

                            case 3:
                                OperationCustomer.create();
                                break;

                            default:
                                System.out.println("INVALID INPUT!");
                                break;
                        }
                    }

                    break;

                case 2:
                    boolean flag2 = true;
                    while (flag2){
                        System.out.println("0.EXIT");
                        System.out.println("1.BANK");
                        System.out.println("2.ACCOUNT");
                        System.out.println("3.USER");
                        int choice2 = Integer.parseInt(sc.readLine());

                        switch (choice2){
                            case 0:
                                flag2=false;
                                break;

                            case 1:
                                OperationBank.Retrieve();
                                break;

                            case 2:
                                OperationAccount.Retrieve();
                                break;

                            case 3:
                                OperationCustomer.Retrieve();
                                break;

                            default:
                                System.out.println("INVALID INPUT!");
                                break;
                        }
                    }
                    break;

                case 3:
                    boolean flag3 = true;
                    while (flag3){
                        System.out.println("0.EXIT");
                        System.out.println("1.BANK");
                        System.out.println("2.ACCOUNT");
                        System.out.println("3.USER");
                        int choice3 = Integer.parseInt(sc.readLine());

                        switch (choice3){
                            case 0:
                                flag3=false;
                                break;

                            case 1:
                                OperationBank.Update();
                                break;

                            case 2:
                                OperationAccount.Update();
                                break;

                            case 3:
                                OperationCustomer.Update();
                                break;

                            default:
                                System.out.println("INVALID INPUT!");
                                break;
                        }
                    }
                    break;

                case 4:
                    boolean flag4 = true;
                    while (flag4){
                        System.out.println("0.EXIT");
                        System.out.println("1.BANK");
                        System.out.println("2.ACCOUNT");
                        System.out.println("3.USER");
                        int choice4 = Integer.parseInt(sc.readLine());

                        switch (choice4){
                            case 0:
                                flag4=false;
                                break;

                            case 1:
                                OperationBank.Delete();
                                break;

                            case 2:
                                OperationAccount.Delete();
                                break;

                            case 3:
                                OperationCustomer.Delete();
                                break;

                            default:
                                System.out.println("INVALID INPUT!");
                                break;
                        }
                    }
                    break;

                case 5:
                    QueryOperations.Query1();

                    break;

                case 6:
                    QueryOperations.Query2();
                    break;

                case 7:
                    QueryOperations.Query3();
                    break;

                default:
                    System.out.println("Invalid Input!");
                    break;
            }
        }
    }
}

//        4	600000	TCS	    2021-01-01	prime	    current
//        5	600000		    2023-04-27	Non-Prime	saving
//        6	7500	Coditas	2023-01-27	prime	    Current
//        7	70000	Coditas	2023-04-27	Non-Prime	current
//        8	1000		    2023-04-27	Non-Prime	saving


//"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\lib\idea_rt.jar=64102:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\oditas\Desktop\projects\Eval-11\target\classes;C:\Users\oditas\.m2\repository\org\hibernate\hibernate-core\5.6.5.Final\hibernate-core-5.6.5.Final.jar;C:\Users\oditas\.m2\repository\org\jboss\logging\jboss-logging\3.4.3.Final\jboss-logging-3.4.3.Final.jar;C:\Users\oditas\.m2\repository\javax\persistence\javax.persistence-api\2.2\javax.persistence-api-2.2.jar;C:\Users\oditas\.m2\repository\net\bytebuddy\byte-buddy\1.12.7\byte-buddy-1.12.7.jar;C:\Users\oditas\.m2\repository\antlr\antlr\2.7.7\antlr-2.7.7.jar;C:\Users\oditas\.m2\repository\org\jboss\spec\javax\transaction\jboss-transaction-api_1.2_spec\1.1.1.Final\jboss-transaction-api_1.2_spec-1.1.1.Final.jar;C:\Users\oditas\.m2\repository\org\jboss\jandex\2.4.2.Final\jandex-2.4.2.Final.jar;C:\Users\oditas\.m2\repository\com\fasterxml\classmate\1.5.1\classmate-1.5.1.jar;C:\Users\oditas\.m2\repository\javax\activation\javax.activation-api\1.2.0\javax.activation-api-1.2.0.jar;C:\Users\oditas\.m2\repository\org\hibernate\common\hibernate-commons-annotations\5.1.2.Final\hibernate-commons-annotations-5.1.2.Final.jar;C:\Users\oditas\.m2\repository\javax\xml\bind\jaxb-api\2.3.1\jaxb-api-2.3.1.jar;C:\Users\oditas\.m2\repository\org\glassfish\jaxb\jaxb-runtime\2.3.1\jaxb-runtime-2.3.1.jar;C:\Users\oditas\.m2\repository\org\glassfish\jaxb\txw2\2.3.1\txw2-2.3.1.jar;C:\Users\oditas\.m2\repository\com\sun\istack\istack-commons-runtime\3.0.7\istack-commons-runtime-3.0.7.jar;C:\Users\oditas\.m2\repository\org\jvnet\staxex\stax-ex\1.8\stax-ex-1.8.jar;C:\Users\oditas\.m2\repository\com\sun\xml\fastinfoset\FastInfoset\1.2.15\FastInfoset-1.2.15.jar;C:\Users\oditas\.m2\repository\org\hibernate\hibernate-annotations\3.5.6-Final\hibernate-annotations-3.5.6-Final.jar;C:\Users\oditas\.m2\repository\org\hibernate\hibernate-commons-annotations\3.2.0.Final\hibernate-commons-annotations-3.2.0.Final.jar;C:\Users\oditas\.m2\repository\org\hibernate\javax\persistence\hibernate-jpa-2.0-api\1.0.0.Final\hibernate-jpa-2.0-api-1.0.0.Final.jar;C:\Users\oditas\.m2\repository\org\slf4j\slf4j-api\1.5.8\slf4j-api-1.5.8.jar;C:\Users\oditas\.m2\repository\mysql\mysql-connector-java\8.0.28\mysql-connector-java-8.0.28.jar;C:\Users\oditas\.m2\repository\com\google\protobuf\protobuf-java\3.11.4\protobuf-java-3.11.4.jar org.example.App
//        0.EXIT
//        1.CREATE
//        2.RETRIEVE
//        3.UPDATE
//        4.DELETE
//        5.QUERY-1
//        6.QUERY-2
//        7.QUERY-3
//        1
//        0.EXIT
//        1.BANK
//        2.ACCOUNT
//        3.USER
//        1
//        Apr 27, 2023 2:32:17 PM org.hibernate.jpa.internal.util.LogHelper logPersistenceUnitInformation
//        INFO: HHH000204: Processing PersistenceUnitInfo [name: aryaman]
//        Apr 27, 2023 2:32:17 PM org.hibernate.Version logVersion
//        INFO: HHH000412: Hibernate ORM core version 5.6.5.Final
//        Apr 27, 2023 2:32:17 PM org.hibernate.annotations.common.reflection.java.JavaReflectionManager <clinit>
//INFO: HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
//        Apr 27, 2023 2:32:17 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
//        WARN: HHH10001002: Using Hibernate built-in connection pool (not for production use!)
//        Apr 27, 2023 2:32:17 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//        INFO: HHH10001005: using driver [com.mysql.cj.jdbc.Driver] at URL [jdbc:mysql://localhost:3306/eval_11?createDatabaseIfNotExist=true]
//        Apr 27, 2023 2:32:17 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//        INFO: HHH10001001: Connection properties: {password=****, user=root}
//        Apr 27, 2023 2:32:17 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//        INFO: HHH10001003: Autocommit mode: false
//        Apr 27, 2023 2:32:17 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PooledConnections <init>
//INFO: HHH000115: Hibernate connection pool size: 20 (min=1)
//        Apr 27, 2023 2:32:18 PM org.hibernate.dialect.Dialect <init>
//INFO: HHH000400: Using dialect: org.hibernate.dialect.MySQL8Dialect
//        Apr 27, 2023 2:32:19 PM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
//        INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@7e4c72d6] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
//        Apr 27, 2023 2:32:19 PM org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator initiateService
//        INFO: HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
//        Enter Name:
//        ICICI
//        Hibernate:
//        insert
//        into
//        Bank
//        (name)
//        values
//        (?)
//        0.EXIT
//        1.BANK
//        2.ACCOUNT
//        3.USER
//        3
//        Apr 27, 2023 2:32:27 PM org.hibernate.jpa.internal.util.LogHelper logPersistenceUnitInformation
//        INFO: HHH000204: Processing PersistenceUnitInfo [name: aryaman]
//        Apr 27, 2023 2:32:27 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
//        WARN: HHH10001002: Using Hibernate built-in connection pool (not for production use!)
//        Apr 27, 2023 2:32:27 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//        INFO: HHH10001005: using driver [com.mysql.cj.jdbc.Driver] at URL [jdbc:mysql://localhost:3306/eval_11?createDatabaseIfNotExist=true]
//        Apr 27, 2023 2:32:27 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//        INFO: HHH10001001: Connection properties: {password=****, user=root}
//        Apr 27, 2023 2:32:27 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//        INFO: HHH10001003: Autocommit mode: false
//        Apr 27, 2023 2:32:27 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PooledConnections <init>
//INFO: HHH000115: Hibernate connection pool size: 20 (min=1)
//        Apr 27, 2023 2:32:27 PM org.hibernate.dialect.Dialect <init>
//INFO: HHH000400: Using dialect: org.hibernate.dialect.MySQL8Dialect
//        Apr 27, 2023 2:32:27 PM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
//        INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@642ee49c] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
//        Apr 27, 2023 2:32:28 PM org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator initiateService
//        INFO: HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
//        Enter Name:
//        Ram
//        Enter Bank ID:
//        3
//        Hibernate:
//        select
//        bank0_.id as id1_2_0_,
//        bank0_.name as name2_2_0_
//        from
//        Bank bank0_
//        where
//        bank0_.id=?
//        Hibernate:
//        insert
//        into
//        Customer
//        (bank_id, name)
//        values
//        (?, ?)
//        0.EXIT
//        1.BANK
//        2.ACCOUNT
//        3.USER
//        2
//        Apr 27, 2023 2:32:46 PM org.hibernate.jpa.internal.util.LogHelper logPersistenceUnitInformation
//        INFO: HHH000204: Processing PersistenceUnitInfo [name: aryaman]
//        Apr 27, 2023 2:32:46 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
//        WARN: HHH10001002: Using Hibernate built-in connection pool (not for production use!)
//        Apr 27, 2023 2:32:46 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//        INFO: HHH10001005: using driver [com.mysql.cj.jdbc.Driver] at URL [jdbc:mysql://localhost:3306/eval_11?createDatabaseIfNotExist=true]
//        Apr 27, 2023 2:32:46 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//        INFO: HHH10001001: Connection properties: {password=****, user=root}
//        Apr 27, 2023 2:32:46 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//        INFO: HHH10001003: Autocommit mode: false
//        Apr 27, 2023 2:32:46 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PooledConnections <init>
//INFO: HHH000115: Hibernate connection pool size: 20 (min=1)
//        Apr 27, 2023 2:32:46 PM org.hibernate.dialect.Dialect <init>
//INFO: HHH000400: Using dialect: org.hibernate.dialect.MySQL8Dialect
//        Apr 27, 2023 2:32:46 PM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
//        INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@5a058be5] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
//        Apr 27, 2023 2:32:46 PM org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator initiateService
//        INFO: HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
//        Enter Customer ID:
//        4
//        Enter Account Type:
//        current
//        Enter Balance:
//        70000
//        Enter Company name:
//        Coditas
//        Hibernate:
//        select
//        customer0_.id as id1_4_0_,
//        customer0_.bank_id as bank_id3_4_0_,
//        customer0_.name as name2_4_0_,
//        bank1_.id as id1_2_1_,
//        bank1_.name as name2_2_1_
//        from
//        Customer customer0_
//        left outer join
//        Bank bank1_
//        on customer0_.bank_id=bank1_.id
//        where
//        customer0_.id=?
//        Hibernate:
//        insert
//        into
//        Account
//        (balance, companyName, date, priv, type)
//        values
//        (?, ?, ?, ?, ?)
//        Hibernate:
//        insert
//        into
//        Account_Customer
//        (Account_id, customers_id)
//        values
//        (?, ?)
//        0.EXIT
//        1.BANK
//        2.ACCOUNT
//        3.USER
//        2
//        Enter Customer ID:
//        4
//        Enter Account Type:
//        saving
//        Enter Balance:
//        1000
//        Hibernate:
//        select
//        customer0_.id as id1_4_0_,
//        customer0_.bank_id as bank_id3_4_0_,
//        customer0_.name as name2_4_0_,
//        bank1_.id as id1_2_1_,
//        bank1_.name as name2_2_1_
//        from
//        Customer customer0_
//        left outer join
//        Bank bank1_
//        on customer0_.bank_id=bank1_.id
//        where
//        customer0_.id=?
//        Hibernate:
//        insert
//        into
//        Account
//        (balance, companyName, date, priv, type)
//        values
//        (?, ?, ?, ?, ?)
//        Hibernate:
//        insert
//        into
//        Account_Customer
//        (Account_id, customers_id)
//        values
//        (?, ?)
//        0.EXIT
//        1.BANK
//        2.ACCOUNT
//        3.USER
//        0
//        0.EXIT
//        1.CREATE
//        2.RETRIEVE
//        3.UPDATE
//        4.DELETE
//        5.QUERY-1
//        6.QUERY-2
//        7.QUERY-3
//        3
//        0.EXIT
//        1.BANK
//        2.ACCOUNT
//        3.USER
//        3
//        Enter ID:
//        4
//        Enter Updated Name:
//        Ram Singh
//        Hibernate:
//        select
//        customer0_.id as id1_4_0_,
//        customer0_.bank_id as bank_id3_4_0_,
//        customer0_.name as name2_4_0_,
//        bank1_.id as id1_2_1_,
//        bank1_.name as name2_2_1_
//        from
//        Customer customer0_
//        left outer join
//        Bank bank1_
//        on customer0_.bank_id=bank1_.id
//        where
//        customer0_.id=?
//        Hibernate:
//        update
//        Customer
//        set
//        bank_id=?,
//        name=?
//        where
//        id=?
//        0.EXIT
//        1.BANK
//        2.ACCOUNT
//        3.USER
//        0
//        0.EXIT
//        1.CREATE
//        2.RETRIEVE
//        3.UPDATE
//        4.DELETE
//        5.QUERY-1
//        6.QUERY-2
//        7.QUERY-3
//        5
//        Apr 27, 2023 2:34:46 PM org.hibernate.jpa.internal.util.LogHelper logPersistenceUnitInformation
//        INFO: HHH000204: Processing PersistenceUnitInfo [name: aryaman]
//        Apr 27, 2023 2:34:46 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
//        WARN: HHH10001002: Using Hibernate built-in connection pool (not for production use!)
//        Apr 27, 2023 2:34:46 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//        INFO: HHH10001005: using driver [com.mysql.cj.jdbc.Driver] at URL [jdbc:mysql://localhost:3306/eval_11?createDatabaseIfNotExist=true]
//        Apr 27, 2023 2:34:46 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//        INFO: HHH10001001: Connection properties: {password=****, user=root}
//        Apr 27, 2023 2:34:46 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//        INFO: HHH10001003: Autocommit mode: false
//        Apr 27, 2023 2:34:46 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PooledConnections <init>
//INFO: HHH000115: Hibernate connection pool size: 20 (min=1)
//        Apr 27, 2023 2:34:46 PM org.hibernate.dialect.Dialect <init>
//INFO: HHH000400: Using dialect: org.hibernate.dialect.MySQL8Dialect
//        Apr 27, 2023 2:34:46 PM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
//        INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@718fd7c1] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
//        Apr 27, 2023 2:34:47 PM org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator initiateService
//        INFO: HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
//        Hibernate:
//        select
//        account0_.id as id1_0_,
//        account0_.balance as balance2_0_,
//        account0_.companyName as companyn3_0_,
//        account0_.date as date4_0_,
//        account0_.priv as priv5_0_,
//        account0_.type as type6_0_
//        from
//        Account account0_
//        where
//        account0_.date<=?
//        ID:1
//        DATE:2020-01-27
//        ---------------------------
//        ID:4
//        DATE:2021-01-01
//        ---------------------------
//
//        Total records:2
//        0.EXIT
//        1.CREATE
//        2.RETRIEVE
//        3.UPDATE
//        4.DELETE
//        5.QUERY-1
//        6.QUERY-2
//        7.QUERY-3
//        6
//        Hibernate:
//        update
//        Account
//        set
//        priv=?
//        where
//        balance>100000
//        and date<=?
//        3 record updated!
//        0.EXIT
//        1.CREATE
//        2.RETRIEVE
//        3.UPDATE
//        4.DELETE
//        5.QUERY-1
//        6.QUERY-2
//        7.QUERY-3
//        7
//        How many months pending:
//        2
//        Hibernate:
//        update
//        Account
//        set
//        balance=balance-500
//        where
//        type='current'
//        and balance<100000
//        Hibernate:
//        update
//        Account
//        set
//        balance=balance-300
//        where
//        type='saving'
//        and balance<10000
//        4 rows updated.
//        Insufficient Balance!!
//        Rs.500 Deducted!!
//        -----------------------------------
//        Save More!!
//        Rs.300 Deducted!!
//        -----------------------------------
//        0.EXIT
//        1.CREATE
//        2.RETRIEVE
//        3.UPDATE
//        4.DELETE
//        5.QUERY-1
//        6.QUERY-2
//        7.QUERY-3
//        0
//
//        Process finished with exit code 0
