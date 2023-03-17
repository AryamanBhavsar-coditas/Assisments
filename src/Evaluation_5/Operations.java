package Evaluation_5;

import java.util.*;

public class Operations {
    Scanner sc = new Scanner(System.in);
    ArrayList<Customer> l1 = new ArrayList<Customer>();


    public void newConnection(){
        System.out.println("Enter Name::");
        String name = sc.next();
        System.out.println("Enter Email::");
        String email = sc.next();
        System.out.println("Enter Address::");
        String address = sc.next();
        System.out.println("Enter Simtype (prepaid/postpaid)::");
        String simType = sc.next();
        System.out.println("Enter Aadhar Number::");
        int aadharNo = sc.nextInt();
        System.out.println("Enter Initial Balance::");
        int initialBal = sc.nextInt();
        System.out.println();
        System.out.println("************************");
        System.out.print("Mobile number alloted to customer is::");

        Random random = new Random();
        int mobno = random.nextInt(900000000) + 1000000000;

        System.out.println(mobno);

        Customer customer = new Customer(name,email,address,simType,aadharNo,initialBal,mobno);
        l1.add(customer);
    }

    public void ViewAllUser(){
        Collections.sort(l1,new SortByName());
        for (Customer c:l1) {
            System.out.println("------------------------------");
            System.out.println("Name:      |  "+c.name);
            System.out.println("Number:    |  "+c.mobNo);
            System.out.println("Balance:   |  "+"Rs."+c.initialBalance);
            System.out.println("Validity:  |  "+c.validity+" Month");
            System.out.println("-------------------------------");
        }

    }

    public void CheckBalance(){
        for(Customer c : l1){
            System.out.println("Number is::"+c.getMobNo());
        }

        System.out.println("Enter your Number::");
        int mobno = sc.nextInt();

        for(Customer c:l1 ){

            if(c.mobNo!=mobno){
                try {
                    throw new UserNotExistException();
                } catch (UserNotExistException e) {
                    e.getMessage();
                }
            }

            else{
                System.out.println("----------------------------");
                System.out.println("Name:"+c.getName());
                System.out.println("Balance: Rs."+c.getInitialBalance());
                System.out.println("Validity:"+c.getValidity()+" Month");
                System.out.println("----------------------------");
                System.out.println();
            }
        }
    }

    public void Recharge(){
        System.out.println("Enter Mobile Number::");
        long mobNo = sc.nextInt();
        System.out.println("Enter Recharge Amount::");
        int amount = sc.nextInt();
        if(amount<0 || amount==0){
            try {
                throw new RechargeAmountLowException();
            } catch (RechargeAmountLowException e) {
                e.getMessage();
            }
        }

        else {

            for (Customer c : l1) {
                if (c.mobNo == mobNo) {
                    c.initialBalance = c.initialBalance + amount;
                    c.validity = c.validity+1;
                }
            }

        }
    }
}

class SortByName implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.name.compareTo(o2.name);
    }
}