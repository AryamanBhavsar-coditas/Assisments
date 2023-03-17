package Evaluation_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class MainMenu {
    public static void main(String[] args) throws IOException, SQLException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StudentOperations studentOperations = new StudentOperations();
        TeacherOperations teacherOperations = new TeacherOperations();
        SQLops sqLops = new SQLops();
        boolean flag = true;

        while(flag){
            System.out.println("0.EXIT");
            System.out.println("1.STUDENT");
            System.out.println("2.TEACHER");
            System.out.println("5.QUERY 1");
            System.out.println("6.QUERY 2");
            System.out.println("7.QUERY 3");
            int choice = Integer.parseInt(bf.readLine());

            switch (choice){
                case 0:
                    flag=false;
                    System.out.println("Thank-You Visit again!");

                    break;

                case 1:
                    boolean flag1 = true;
                    while (flag1){
                        System.out.println("0.EXIT");
                        System.out.println("1.RETRIVE");
                        System.out.println("2.UPDATE");
                        System.out.println("3.DELETE");
                        System.out.println("4.INSERT");
                        int choice1 = Integer.parseInt(bf.readLine());

                        switch (choice1){
                            case 0:
                                flag1=false;
                                break;

                            case 1:
                                studentOperations.Retrieve();
                                break;

                            case 2:
                                studentOperations.Update();
                                break;

                            case 3:
                                studentOperations.Delete();
                                break;

                            case 4:
                                studentOperations.Insert();
                                break;
                        }
                    }


                    break;

                case 2:
                    boolean flag2 = true;
                    while (flag2){
                        System.out.println("0.EXIT");
                        System.out.println("1.RETRIVE");
                        System.out.println("2.UPDATE");
                        System.out.println("3.DELETE");
                        System.out.println("4.INSERT");
                        int choice2 = Integer.parseInt(bf.readLine());

                        switch (choice2){
                            case 0:
                                flag2=false;
                                break;

                            case 1:
                                teacherOperations.Retrieve();
                                break;

                            case 2:
                                teacherOperations.Update();
                                break;

                            case 3:
                                teacherOperations.Delete();
                                break;

                            case 4:
                                teacherOperations.Insert();
                                break;
                        }
                    }
                    break;


                case 5:
                    sqLops.Q1();
                    break;

                case 6:
                    sqLops.Q2();
                    break;

                case 7:
                    sqLops.Q3();
                    break;

                default:
                    System.out.println("Enter Valid Option!!");
                    break;
            }
        }
    }
}
