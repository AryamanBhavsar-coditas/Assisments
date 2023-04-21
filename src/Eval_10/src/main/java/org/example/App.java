package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, ParseException {

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        boolean flag = true;

        while (flag){
            System.out.println("***MAIN MENU***");
            System.out.println();
            System.out.println("0.EXIT");
            System.out.println("1.CREATE");
            System.out.println("2.RETRIEVE");
            System.out.println("3.UPDATE");
            System.out.println("4.DELETE");
            System.out.println("5.QUERY 1");
            System.out.println("6.QUERY 2");
            System.out.println("7.QUERY 3");
            int choice = Integer.parseInt(sc.readLine());

            switch (choice){
                case 0:
                    System.out.println("THANK-YOU!");
                    flag=false;
                    break;

                case 1:
                    boolean flag1 = true;
                    while (flag1) {
                        System.out.println("What you want to Create?");
                        System.out.println();
                        System.out.println("0.EXIT");
                        System.out.println("1.AUTHOR");
                        System.out.println("2.BOOK");
                        System.out.println("3.PUBLISHER");
                        int choice1 = Integer.parseInt(sc.readLine());

                        switch (choice1) {
                            case 0:
                                flag1 = false;
                                break;

                            case 1:
                                OperationsAuthor.create();
                                break;

                            case 2:
                                OperationsBook.create();
                                break;

                            case 3:
                                OperationsPublisher.create();
                                break;

                            default:
                                System.out.println("Invalid Choice!");
                                break;
                        }

                    }

                    break;

                case 2:
                    boolean flag2 = true;
                    while (flag2) {
                        System.out.println("What you want to Retrieve?");
                        System.out.println();
                        System.out.println("0.EXIT");
                        System.out.println("1.AUTHOR");
                        System.out.println("2.BOOK");
                        System.out.println("3.PUBLISHER");
                        int choice1 = Integer.parseInt(sc.readLine());

                        switch (choice1) {
                            case 0:
                                flag2 = false;
                                break;

                            case 1:
                                OperationsAuthor.Select();
                                break;

                            case 2:
                                OperationsBook.Select();
                                break;

                            case 3:
                                OperationsPublisher.Select();
                                break;

                            default:
                                System.out.println("Invalid Choice!");
                                break;
                        }

                    }
                    break;

                case 3:
                    boolean flag3 = true;
                    while (flag3) {
                        System.out.println("What you want to Update?");
                        System.out.println();
                        System.out.println("0.EXIT");
                        System.out.println("1.AUTHOR");
                        System.out.println("2.BOOK");
                        System.out.println("3.PUBLISHER");
                        int choice1 = Integer.parseInt(sc.readLine());

                        switch (choice1) {
                            case 0:
                                flag3 = false;
                                break;

                            case 1:
                                OperationsAuthor.Update();
                                break;

                            case 2:
                                OperationsBook.Update();
                                break;

                            case 3:
                                OperationsPublisher.Update();
                                break;

                            default:
                                System.out.println("Invalid Choice!");
                                break;
                        }

                    }
                    break;

                case 4:
                    boolean flag4 = true;
                    while (flag4) {
                        System.out.println("What you want to Delete?");
                        System.out.println();
                        System.out.println("0.EXIT");
                        System.out.println("1.AUTHOR");
                        System.out.println("2.BOOK");
                        System.out.println("3.PUBLISHER");
                        int choice1 = Integer.parseInt(sc.readLine());

                        switch (choice1) {
                            case 0:
                                flag4 = false;
                                break;

                            case 1:
                                OperationsAuthor.Delete();
                                break;

                            case 2:
                                OperationsBook.Delete();
                                break;

                            case 3:
                                OperationsPublisher.Delete();
                                break;

                            default:
                                System.out.println("Invalid Choice!");
                                break;
                        }

                    }
                    break;

                case 5:
                    OperationsQuery.Query11();
                    break;

                case 6:
                    OperationsQuery.Query2();
                    break;

                case 7:
                    OperationsQuery.Query3();
                    break;

                default:
                    System.out.println("Invalid Input!!");
                    break;
            }
        }


    }
}

//
//Output-
//
//        "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\lib\idea_rt.jar=56743:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\oditas\IdeaProjects\Eval_10\target\classes;C:\Users\oditas\.m2\repository\org\hibernate\hibernate-core\5.6.5.Final\hibernate-core-5.6.5.Final.jar;C:\Users\oditas\.m2\repository\org\jboss\logging\jboss-logging\3.4.3.Final\jboss-logging-3.4.3.Final.jar;C:\Users\oditas\.m2\repository\javax\persistence\javax.persistence-api\2.2\javax.persistence-api-2.2.jar;C:\Users\oditas\.m2\repository\net\bytebuddy\byte-buddy\1.12.7\byte-buddy-1.12.7.jar;C:\Users\oditas\.m2\repository\antlr\antlr\2.7.7\antlr-2.7.7.jar;C:\Users\oditas\.m2\repository\org\jboss\spec\javax\transaction\jboss-transaction-api_1.2_spec\1.1.1.Final\jboss-transaction-api_1.2_spec-1.1.1.Final.jar;C:\Users\oditas\.m2\repository\org\jboss\jandex\2.4.2.Final\jandex-2.4.2.Final.jar;C:\Users\oditas\.m2\repository\com\fasterxml\classmate\1.5.1\classmate-1.5.1.jar;C:\Users\oditas\.m2\repository\javax\activation\javax.activation-api\1.2.0\javax.activation-api-1.2.0.jar;C:\Users\oditas\.m2\repository\org\hibernate\common\hibernate-commons-annotations\5.1.2.Final\hibernate-commons-annotations-5.1.2.Final.jar;C:\Users\oditas\.m2\repository\javax\xml\bind\jaxb-api\2.3.1\jaxb-api-2.3.1.jar;C:\Users\oditas\.m2\repository\org\glassfish\jaxb\jaxb-runtime\2.3.1\jaxb-runtime-2.3.1.jar;C:\Users\oditas\.m2\repository\org\glassfish\jaxb\txw2\2.3.1\txw2-2.3.1.jar;C:\Users\oditas\.m2\repository\com\sun\istack\istack-commons-runtime\3.0.7\istack-commons-runtime-3.0.7.jar;C:\Users\oditas\.m2\repository\org\jvnet\staxex\stax-ex\1.8\stax-ex-1.8.jar;C:\Users\oditas\.m2\repository\com\sun\xml\fastinfoset\FastInfoset\1.2.15\FastInfoset-1.2.15.jar;C:\Users\oditas\.m2\repository\org\hibernate\hibernate-annotations\3.5.6-Final\hibernate-annotations-3.5.6-Final.jar;C:\Users\oditas\.m2\repository\org\hibernate\hibernate-commons-annotations\3.2.0.Final\hibernate-commons-annotations-3.2.0.Final.jar;C:\Users\oditas\.m2\repository\org\hibernate\javax\persistence\hibernate-jpa-2.0-api\1.0.0.Final\hibernate-jpa-2.0-api-1.0.0.Final.jar;C:\Users\oditas\.m2\repository\org\slf4j\slf4j-api\1.5.8\slf4j-api-1.5.8.jar;C:\Users\oditas\.m2\repository\mysql\mysql-connector-java\8.0.28\mysql-connector-java-8.0.28.jar;C:\Users\oditas\.m2\repository\com\google\protobuf\protobuf-java\3.11.4\protobuf-java-3.11.4.jar org.example.App
//        ***MAIN MENU***
//
//        0.EXIT
//        1.CREATE
//        2.RETRIEVE
//        3.UPDATE
//        4.DELETE
//        5.QUERY 1
//        6.QUERY 2
//        7.QUERY 3
//        1
//        What you want to Create?
//
//        0.EXIT
//        1.AUTHOR
//        2.BOOK
//        3.PUBLISHER
//        1
//        Apr 21, 2023 4:06:12 PM org.hibernate.Version logVersion
//        INFO: HHH000412: Hibernate ORM core version 5.6.5.Final
//        Apr 21, 2023 4:06:13 PM org.hibernate.annotations.common.reflection.java.JavaReflectionManager <clinit>
//INFO: HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
//        Apr 21, 2023 4:06:13 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
//        WARN: HHH10001002: Using Hibernate built-in connection pool (not for production use!)
//        Apr 21, 2023 4:06:13 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//        INFO: HHH10001005: using driver [com.mysql.cj.jdbc.Driver] at URL [jdbc:mysql://localhost:3306/hibernate_eval_10?createDatabaseIfNotExist=true]
//        Apr 21, 2023 4:06:13 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//        INFO: HHH10001001: Connection properties: {password=****, user=root}
//        Apr 21, 2023 4:06:13 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//        INFO: HHH10001003: Autocommit mode: false
//        Apr 21, 2023 4:06:13 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PooledConnections <init>
//INFO: HHH000115: Hibernate connection pool size: 20 (min=1)
//        Apr 21, 2023 4:06:14 PM org.hibernate.dialect.Dialect <init>
//INFO: HHH000400: Using dialect: org.hibernate.dialect.MySQL5Dialect
//        Apr 21, 2023 4:06:15 PM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
//        INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@101a461c] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
//        Hibernate: alter table Author_Book add constraint FK3wjtcus6sftdj8dfvthui6335 foreign key (books_id) references Book (id)
//        Hibernate: alter table Author_Book add constraint FKo3f90h3ibr9jtq0u93mjgi5qd foreign key (Author_id) references Author (id)
//        Hibernate: alter table Book add constraint FK5gbo4o7yxefxivwuqjichc67t foreign key (author_id) references Author (id)
//        Hibernate: alter table Book add constraint FKrb2njmkvio5mhe42empuaiphu foreign key (publisher_id) references Publisher (id)
//        Hibernate: alter table Publisher add constraint FKb8k6x2kw9yfymwp519ywvax33 foreign key (author_id) references Author (id)
//        Hibernate: alter table Publisher add constraint FKacdcxrasstftqef4tvkcov3mo foreign key (book_id) references Book (id)
//        Enter Author Name:
//        Pranav
//        Hibernate: insert into Author (name) values (?)
//        Author Added Sucessfully!
//        What you want to Create?
//
//        0.EXIT
//        1.AUTHOR
//        2.BOOK
//        3.PUBLISHER
//        2
//        Apr 21, 2023 4:06:32 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
//        WARN: HHH10001002: Using Hibernate built-in connection pool (not for production use!)
//        Apr 21, 2023 4:06:32 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//        INFO: HHH10001005: using driver [com.mysql.cj.jdbc.Driver] at URL [jdbc:mysql://localhost:3306/hibernate_eval_10?createDatabaseIfNotExist=true]
//        Apr 21, 2023 4:06:32 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//        INFO: HHH10001001: Connection properties: {password=****, user=root}
//        Apr 21, 2023 4:06:32 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//        INFO: HHH10001003: Autocommit mode: false
//        Apr 21, 2023 4:06:32 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PooledConnections <init>
//INFO: HHH000115: Hibernate connection pool size: 20 (min=1)
//        Apr 21, 2023 4:06:32 PM org.hibernate.dialect.Dialect <init>
//INFO: HHH000400: Using dialect: org.hibernate.dialect.MySQL5Dialect
//        Apr 21, 2023 4:06:32 PM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
//        INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@1b90fee4] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
//        Hibernate: alter table Author_Book add constraint FK3wjtcus6sftdj8dfvthui6335 foreign key (books_id) references Book (id)
//        Hibernate: alter table Author_Book add constraint FKo3f90h3ibr9jtq0u93mjgi5qd foreign key (Author_id) references Author (id)
//        Hibernate: alter table Book add constraint FK5gbo4o7yxefxivwuqjichc67t foreign key (author_id) references Author (id)
//        Hibernate: alter table Book add constraint FKrb2njmkvio5mhe42empuaiphu foreign key (publisher_id) references Publisher (id)
//        Hibernate: alter table Publisher add constraint FKb8k6x2kw9yfymwp519ywvax33 foreign key (author_id) references Author (id)
//        Hibernate: alter table Publisher add constraint FKacdcxrasstftqef4tvkcov3mo foreign key (book_id) references Book (id)
//        Enter Book Name:
//        Cars
//        Enter Book Price:
//        670
//        Enter Author ID:
//        6
//        Enter Publisher ID:
//        1
//        Hibernate: select author0_.id as id1_0_0_, author0_.name as name2_0_0_ from Author author0_ where author0_.id=?
//        Hibernate: select publisher0_.id as id1_3_0_, publisher0_.author_id as author_i3_3_0_, publisher0_.book_id as book_id4_3_0_, publisher0_.name as name2_3_0_, author1_.id as id1_0_1_, author1_.name as name2_0_1_, book2_.id as id1_2_2_, book2_.BookPrice as bookpric2_2_2_, book2_.author_id as author_i5_2_2_, book2_.date as date3_2_2_, book2_.name as name4_2_2_, book2_.publisher_id as publishe6_2_2_, author3_.id as id1_0_3_, author3_.name as name2_0_3_, publisher4_.id as id1_3_4_, publisher4_.author_id as author_i3_3_4_, publisher4_.book_id as book_id4_3_4_, publisher4_.name as name2_3_4_ from Publisher publisher0_ left outer join Author author1_ on publisher0_.author_id=author1_.id left outer join Book book2_ on publisher0_.book_id=book2_.id left outer join Author author3_ on book2_.author_id=author3_.id left outer join Publisher publisher4_ on book2_.publisher_id=publisher4_.id where publisher0_.id=?
//        Hibernate: insert into Book (BookPrice, author_id, date, name, publisher_id) values (?, ?, ?, ?, ?)
//        Book Added Sucessfully!
//        What you want to Create?
//
//        0.EXIT
//        1.AUTHOR
//        2.BOOK
//        3.PUBLISHER
//        0
//        ***MAIN MENU***
//
//        0.EXIT
//        1.CREATE
//        2.RETRIEVE
//        3.UPDATE
//        4.DELETE
//        5.QUERY 1
//        6.QUERY 2
//        7.QUERY 3
//        2
//        What you want to Retrieve?
//
//        0.EXIT
//        1.AUTHOR
//        2.BOOK
//        3.PUBLISHER
//        1
//        Hibernate: select author0_.id as id1_0_, author0_.name as name2_0_ from Author author0_
//        Author{id=1, name='Aryaman'}
//        Author{id=2, name='Tanmay'}
//        Author{id=3, name='Anjali'}
//        Author{id=4, name='Aartii'}
//        Author{id=5, name='Krati'}
//        Author{id=6, name='Pranav'}
//        What you want to Retrieve?
//
//        0.EXIT
//        1.AUTHOR
//        2.BOOK
//        3.PUBLISHER
//        2
//        Hibernate: select book0_.id as id1_2_, book0_.BookPrice as bookpric2_2_, book0_.author_id as author_i5_2_, book0_.date as date3_2_, book0_.name as name4_2_, book0_.publisher_id as publishe6_2_ from Book book0_
//        Hibernate: select author0_.id as id1_0_0_, author0_.name as name2_0_0_ from Author author0_ where author0_.id=?
//        Hibernate: select publisher0_.id as id1_3_0_, publisher0_.author_id as author_i3_3_0_, publisher0_.book_id as book_id4_3_0_, publisher0_.name as name2_3_0_, author1_.id as id1_0_1_, author1_.name as name2_0_1_, book2_.id as id1_2_2_, book2_.BookPrice as bookpric2_2_2_, book2_.author_id as author_i5_2_2_, book2_.date as date3_2_2_, book2_.name as name4_2_2_, book2_.publisher_id as publishe6_2_2_, author3_.id as id1_0_3_, author3_.name as name2_0_3_, publisher4_.id as id1_3_4_, publisher4_.author_id as author_i3_3_4_, publisher4_.book_id as book_id4_3_4_, publisher4_.name as name2_3_4_ from Publisher publisher0_ left outer join Author author1_ on publisher0_.author_id=author1_.id left outer join Book book2_ on publisher0_.book_id=book2_.id left outer join Author author3_ on book2_.author_id=author3_.id left outer join Publisher publisher4_ on book2_.publisher_id=publisher4_.id where publisher0_.id=?
//        Hibernate: select author0_.id as id1_0_0_, author0_.name as name2_0_0_ from Author author0_ where author0_.id=?
//        Hibernate: select author0_.id as id1_0_0_, author0_.name as name2_0_0_ from Author author0_ where author0_.id=?
//        Hibernate: select author0_.id as id1_0_0_, author0_.name as name2_0_0_ from Author author0_ where author0_.id=?
//        Hibernate: select author0_.id as id1_0_0_, author0_.name as name2_0_0_ from Author author0_ where author0_.id=?
//        Hibernate: select author0_.id as id1_0_0_, author0_.name as name2_0_0_ from Author author0_ where author0_.id=?
//        Book{id=1, name='C++', BookPrice=100, author=null, publisher=null}
//        Book{id=2, name='Java', BookPrice=200, author=null, publisher=null}
//        Book{id=3, name='DSA', BookPrice=302, author=Author{id=2, name='Tanmay'}, publisher=Publisher{id=1, name='Nirali', book=Book{id=1, name='C++', BookPrice=100, author=null, publisher=null}}}
//        Book{id=4, name='Python', BookPrice=600, author=Author{id=1, name='Aryaman'}, publisher=Publisher{id=1, name='Nirali', book=Book{id=1, name='C++', BookPrice=100, author=null, publisher=null}}}
//        Book{id=5, name='Ramayan', BookPrice=700, author=Author{id=3, name='Anjali'}, publisher=Publisher{id=1, name='Nirali', book=Book{id=1, name='C++', BookPrice=100, author=null, publisher=null}}}
//        Book{id=6, name='Mahabharat', BookPrice=567, author=Author{id=4, name='Aartii'}, publisher=Publisher{id=1, name='Nirali', book=Book{id=1, name='C++', BookPrice=100, author=null, publisher=null}}}
//        Book{id=7, name='Jai Shree ram', BookPrice=500, author=Author{id=1, name='Aryaman'}, publisher=Publisher{id=1, name='Nirali', book=Book{id=1, name='C++', BookPrice=100, author=null, publisher=null}}}
//        Book{id=8, name='The Subtle Art ', BookPrice=600, author=Author{id=1, name='Aryaman'}, publisher=Publisher{id=1, name='Nirali', book=Book{id=1, name='C++', BookPrice=100, author=null, publisher=null}}}
//        Book{id=9, name='The Fairy Tale', BookPrice=700, author=Author{id=1, name='Aryaman'}, publisher=Publisher{id=1, name='Nirali', book=Book{id=1, name='C++', BookPrice=100, author=null, publisher=null}}}
//        Book{id=10, name='LBF', BookPrice=450, author=Author{id=5, name='Krati'}, publisher=Publisher{id=1, name='Nirali', book=Book{id=1, name='C++', BookPrice=100, author=null, publisher=null}}}
//        Book{id=11, name='Cars', BookPrice=670, author=Author{id=6, name='Pranav'}, publisher=Publisher{id=1, name='Nirali', book=Book{id=1, name='C++', BookPrice=100, author=null, publisher=null}}}
//        What you want to Retrieve?
//
//        0.EXIT
//        1.AUTHOR
//        2.BOOK
//        3.PUBLISHER
//        3
//        Apr 21, 2023 4:07:24 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
//        WARN: HHH10001002: Using Hibernate built-in connection pool (not for production use!)
//        Apr 21, 2023 4:07:24 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//        INFO: HHH10001005: using driver [com.mysql.cj.jdbc.Driver] at URL [jdbc:mysql://localhost:3306/hibernate_eval_10?createDatabaseIfNotExist=true]
//        Apr 21, 2023 4:07:24 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//        INFO: HHH10001001: Connection properties: {password=****, user=root}
//        Apr 21, 2023 4:07:24 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//        INFO: HHH10001003: Autocommit mode: false
//        Apr 21, 2023 4:07:24 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PooledConnections <init>
//INFO: HHH000115: Hibernate connection pool size: 20 (min=1)
//        Apr 21, 2023 4:07:24 PM org.hibernate.dialect.Dialect <init>
//INFO: HHH000400: Using dialect: org.hibernate.dialect.MySQL5Dialect
//        Apr 21, 2023 4:07:24 PM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
//        INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@1416ff46] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
//        Hibernate: alter table Author_Book add constraint FK3wjtcus6sftdj8dfvthui6335 foreign key (books_id) references Book (id)
//        Hibernate: alter table Author_Book add constraint FKo3f90h3ibr9jtq0u93mjgi5qd foreign key (Author_id) references Author (id)
//        Hibernate: alter table Book add constraint FK5gbo4o7yxefxivwuqjichc67t foreign key (author_id) references Author (id)
//        Hibernate: alter table Book add constraint FKrb2njmkvio5mhe42empuaiphu foreign key (publisher_id) references Publisher (id)
//        Hibernate: alter table Publisher add constraint FKb8k6x2kw9yfymwp519ywvax33 foreign key (author_id) references Author (id)
//        Hibernate: alter table Publisher add constraint FKacdcxrasstftqef4tvkcov3mo foreign key (book_id) references Book (id)
//        Hibernate: select publisher0_.id as id1_3_, publisher0_.author_id as author_i3_3_, publisher0_.book_id as book_id4_3_, publisher0_.name as name2_3_ from Publisher publisher0_
//        Hibernate: select book0_.id as id1_2_0_, book0_.BookPrice as bookpric2_2_0_, book0_.author_id as author_i5_2_0_, book0_.date as date3_2_0_, book0_.name as name4_2_0_, book0_.publisher_id as publishe6_2_0_, author1_.id as id1_0_1_, author1_.name as name2_0_1_, publisher2_.id as id1_3_2_, publisher2_.author_id as author_i3_3_2_, publisher2_.book_id as book_id4_3_2_, publisher2_.name as name2_3_2_, author3_.id as id1_0_3_, author3_.name as name2_0_3_, book4_.id as id1_2_4_, book4_.BookPrice as bookpric2_2_4_, book4_.author_id as author_i5_2_4_, book4_.date as date3_2_4_, book4_.name as name4_2_4_, book4_.publisher_id as publishe6_2_4_ from Book book0_ left outer join Author author1_ on book0_.author_id=author1_.id left outer join Publisher publisher2_ on book0_.publisher_id=publisher2_.id left outer join Author author3_ on publisher2_.author_id=author3_.id left outer join Book book4_ on publisher2_.book_id=book4_.id where book0_.id=?
//        Hibernate: select book0_.id as id1_2_0_, book0_.BookPrice as bookpric2_2_0_, book0_.author_id as author_i5_2_0_, book0_.date as date3_2_0_, book0_.name as name4_2_0_, book0_.publisher_id as publishe6_2_0_, author1_.id as id1_0_1_, author1_.name as name2_0_1_, publisher2_.id as id1_3_2_, publisher2_.author_id as author_i3_3_2_, publisher2_.book_id as book_id4_3_2_, publisher2_.name as name2_3_2_, author3_.id as id1_0_3_, author3_.name as name2_0_3_, book4_.id as id1_2_4_, book4_.BookPrice as bookpric2_2_4_, book4_.author_id as author_i5_2_4_, book4_.date as date3_2_4_, book4_.name as name4_2_4_, book4_.publisher_id as publishe6_2_4_ from Book book0_ left outer join Author author1_ on book0_.author_id=author1_.id left outer join Publisher publisher2_ on book0_.publisher_id=publisher2_.id left outer join Author author3_ on publisher2_.author_id=author3_.id left outer join Book book4_ on publisher2_.book_id=book4_.id where book0_.id=?
//        Publisher{id=1, name='Nirali', book=Book{id=1, name='C++', BookPrice=100, author=null, publisher=null}}
//        Publisher{id=2, name='Coditas', book=Book{id=3, name='DSA', BookPrice=302, author=Author{id=2, name='Tanmay'}, publisher=Publisher{id=1, name='Nirali', book=Book{id=1, name='C++', BookPrice=100, author=null, publisher=null}}}}
//        What you want to Retrieve?
//
//        0.EXIT
//        1.AUTHOR
//        2.BOOK
//        3.PUBLISHER
//        0
//        ***MAIN MENU***
//
//        0.EXIT
//        1.CREATE
//        2.RETRIEVE
//        3.UPDATE
//        4.DELETE
//        5.QUERY 1
//        6.QUERY 2
//        7.QUERY 3
//        3
//        What you want to Update?
//
//        0.EXIT
//        1.AUTHOR
//        2.BOOK
//        3.PUBLISHER
//        1
//        Enter Author ID:
//        6
//        Enter Updated => (name)(book_id)
//        Pranav Jain
//        11
//        Hibernate: select book0_.id as id1_2_0_, book0_.BookPrice as bookpric2_2_0_, book0_.author_id as author_i5_2_0_, book0_.date as date3_2_0_, book0_.name as name4_2_0_, book0_.publisher_id as publishe6_2_0_, author1_.id as id1_0_1_, author1_.name as name2_0_1_, publisher2_.id as id1_3_2_, publisher2_.author_id as author_i3_3_2_, publisher2_.book_id as book_id4_3_2_, publisher2_.name as name2_3_2_, author3_.id as id1_0_3_, author3_.name as name2_0_3_, book4_.id as id1_2_4_, book4_.BookPrice as bookpric2_2_4_, book4_.author_id as author_i5_2_4_, book4_.date as date3_2_4_, book4_.name as name4_2_4_, book4_.publisher_id as publishe6_2_4_ from Book book0_ left outer join Author author1_ on book0_.author_id=author1_.id left outer join Publisher publisher2_ on book0_.publisher_id=publisher2_.id left outer join Author author3_ on publisher2_.author_id=author3_.id left outer join Book book4_ on publisher2_.book_id=book4_.id where book0_.id=?
//        Hibernate: update Author set name=? where id=?
//        Hibernate: delete from Author_Book where Author_id=?
//        Hibernate: insert into Author_Book (Author_id, books_id) values (?, ?)
//        Updated SucessFully!
//        What you want to Update?
//
//        0.EXIT
//        1.AUTHOR
//        2.BOOK
//        3.PUBLISHER
//        0
//        ***MAIN MENU***
//
//        0.EXIT
//        1.CREATE
//        2.RETRIEVE
//        3.UPDATE
//        4.DELETE
//        5.QUERY 1
//        6.QUERY 2
//        7.QUERY 3
//        4
//        What you want to Delete?
//
//        0.EXIT
//        1.AUTHOR
//        2.BOOK
//        3.PUBLISHER
//        1
//        Enter Author ID:
//        4
//        Hibernate: select author0_.id as id1_0_0_, author0_.name as name2_0_0_ from Author author0_ where author0_.id=?
//        Hibernate: delete from Author_Book where Author_id=?
//        Hibernate: delete from Author where id=?
//        What you want to Delete?
//
//        0.EXIT
//        1.AUTHOR
//        2.BOOK
//        3.PUBLISHER
//        0
//        ***MAIN MENU***
//
//        0.EXIT
//        1.CREATE
//        2.RETRIEVE
//        3.UPDATE
//        4.DELETE
//        5.QUERY 1
//        6.QUERY 2
//        7.QUERY 3
//        5
//        Apr 21, 2023 4:08:28 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
//        WARN: HHH10001002: Using Hibernate built-in connection pool (not for production use!)
//        Apr 21, 2023 4:08:28 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//        INFO: HHH10001005: using driver [com.mysql.cj.jdbc.Driver] at URL [jdbc:mysql://localhost:3306/hibernate_eval_10?createDatabaseIfNotExist=true]
//        Apr 21, 2023 4:08:28 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//        INFO: HHH10001001: Connection properties: {password=****, user=root}
//        Apr 21, 2023 4:08:28 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//        INFO: HHH10001003: Autocommit mode: false
//        Apr 21, 2023 4:08:28 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PooledConnections <init>
//INFO: HHH000115: Hibernate connection pool size: 20 (min=1)
//        Apr 21, 2023 4:08:28 PM org.hibernate.dialect.Dialect <init>
//INFO: HHH000400: Using dialect: org.hibernate.dialect.MySQL5Dialect
//        Apr 21, 2023 4:08:28 PM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
//        INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@457a5b2d] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
//        Hibernate: alter table Author_Book add constraint FK3wjtcus6sftdj8dfvthui6335 foreign key (books_id) references Book (id)
//        Hibernate: alter table Author_Book add constraint FKo3f90h3ibr9jtq0u93mjgi5qd foreign key (Author_id) references Author (id)
//        Hibernate: alter table Book add constraint FK5gbo4o7yxefxivwuqjichc67t foreign key (author_id) references Author (id)
//        Hibernate: alter table Book add constraint FKrb2njmkvio5mhe42empuaiphu foreign key (publisher_id) references Publisher (id)
//        Hibernate: alter table Publisher add constraint FKb8k6x2kw9yfymwp519ywvax33 foreign key (author_id) references Author (id)
//        Hibernate: alter table Publisher add constraint FKacdcxrasstftqef4tvkcov3mo foreign key (book_id) references Book (id)
//        Hibernate: select book0_.id as id1_2_, book0_.BookPrice as bookpric2_2_, book0_.author_id as author_i5_2_, book0_.date as date3_2_, book0_.name as name4_2_, book0_.publisher_id as publishe6_2_ from Book book0_ where book0_.date<=?
//        Hibernate: select author0_.id as id1_0_0_, author0_.name as name2_0_0_ from Author author0_ where author0_.id=?
//        Hibernate: select publisher0_.id as id1_3_0_, publisher0_.author_id as author_i3_3_0_, publisher0_.book_id as book_id4_3_0_, publisher0_.name as name2_3_0_, author1_.id as id1_0_1_, author1_.name as name2_0_1_, book2_.id as id1_2_2_, book2_.BookPrice as bookpric2_2_2_, book2_.author_id as author_i5_2_2_, book2_.date as date3_2_2_, book2_.name as name4_2_2_, book2_.publisher_id as publishe6_2_2_, author3_.id as id1_0_3_, author3_.name as name2_0_3_, publisher4_.id as id1_3_4_, publisher4_.author_id as author_i3_3_4_, publisher4_.book_id as book_id4_3_4_, publisher4_.name as name2_3_4_ from Publisher publisher0_ left outer join Author author1_ on publisher0_.author_id=author1_.id left outer join Book book2_ on publisher0_.book_id=book2_.id left outer join Author author3_ on book2_.author_id=author3_.id left outer join Publisher publisher4_ on book2_.publisher_id=publisher4_.id where publisher0_.id=?
//        Hibernate: select author0_.id as id1_0_0_, author0_.name as name2_0_0_ from Author author0_ where author0_.id=?
//        Author Name: Anjali
//        Author Name: Aryaman
//        ***MAIN MENU***
//
//        0.EXIT
//        1.CREATE
//        2.RETRIEVE
//        3.UPDATE
//        4.DELETE
//        5.QUERY 1
//        6.QUERY 2
//        7.QUERY 3