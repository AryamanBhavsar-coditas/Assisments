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
                    OperationsQuery.Query1();
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
