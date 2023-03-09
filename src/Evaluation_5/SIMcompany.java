package Evaluation_5;

import java.util.Scanner;

public class SIMcompany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operations operations = new Operations();

        boolean flag = true;
        System.out.println("^^^^^^^^^^^^^^^^^^");
        System.out.println("     AIRTEL       ");
        System.out.println("^^^^^^^^^^^^^^^^^^");

        while(flag){
            System.out.println("0.EXIT");
            System.out.println("1.PREPAID USER");
            System.out.println("2.NEW CONNECTION");
            System.out.println("3.VIEW ALL USER");
            int choice = sc.nextInt();

            switch (choice){
                case 0:
                    flag = false;
                    break;

                case 1:
                    boolean flag1=true;
                    while(flag1){
                        System.out.println("0.EXIT");
                        System.out.println("1.CHECK BALANCE AND VALIDITY");
                        System.out.println("2.RECHARGE");
                        int choice1 = sc.nextInt();

                        switch (choice1){
                            case 0:
                                flag1=false;
                                break;

                            case 1:
                                operations.CheckBalance();
                                break;

                            case 2:
                                operations.Recharge();
                                break;
                        }
                    }
                    break;

                case 2:
                    operations.newConnection();
                    break;

                case 3:
                    operations.ViewAllUser();
                    break;

                default:
                    System.out.println("Enter Valid Choice!!");
                    break;
            }
        }
    }
}
