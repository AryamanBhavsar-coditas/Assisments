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

//Output-
//        ^^^^^^^^^^^^^^^^^^
//        AIRTEL
//        ^^^^^^^^^^^^^^^^^^
//        0.EXIT
//        1.PREPAID USER
//        2.NEW CONNECTION
//        3.VIEW ALL USER
//        2
//        Enter Name::
//        Aryaman
//        Enter Email::
//        aryaman1701@gmail.com
//Enter Address::
//        Indore
//        Enter Simtype (prepaid/postpaid)::
//        PRepaid
//        Enter Aadhar Number::
//        23456784
//        Enter Initial Balance::
//        1000
//
//        ************************
//        Mobile number alloted to customer is::1749395849
//        ************************
//        0.EXIT
//        1.PREPAID USER
//        2.NEW CONNECTION
//        3.VIEW ALL USER
//        1
//        0.EXIT
//        1.CHECK BALANCE AND VALIDITY
//        2.RECHARGE
//        1
//        Number is::1749395849
//        Enter your Number::
//        1749395849
//        Name:Aryaman
//        Balance: Rs.1000
//        Validity:1 Month
//
//        0.EXIT
//        1.CHECK BALANCE AND VALIDITY
//        2.RECHARGE
//        2
//        Enter Mobile Number::
//        1749395849
//        Enter Recharge Amount::
//        300
//        0.EXIT
//        1.CHECK BALANCE AND VALIDITY
//        2.RECHARGE
//        1
//        Number is::1749395849
//        Enter your Number::
//        1749395849
//        Name:Aryaman
//        Balance: Rs.1300
//        Validity:2 Month
//
//        0.EXIT
//        1.CHECK BALANCE AND VALIDITY
//        2.RECHARGE
//        0
//        0.EXIT
//        1.PREPAID USER
//        2.NEW CONNECTION
//        3.VIEW ALL USER
//        3
//        Customer{name='Aryaman', email='aryaman1701@gmail.com', address='Indore', simType='PRepaid', aadharNo=23456784, initialBalance=1300, validity=2, mobNo=1749395849}
//        0.EXIT
//        1.PREPAID USER
//        2.NEW CONNECTION
//        3.VIEW ALL USER
//        0
