package Evaluation_5;

import java.time.LocalDate;

public class Customer {
    String name,email,address,simType;
    int aadharNo,initialBalance,validity=1;
    int mobNo;

    LocalDate today = LocalDate.now();
    LocalDate valid;


    public Customer(String name, String email, String address, String simType, int aadharNo, int initialBalance,int mobNo) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.simType = simType;
        this.aadharNo = aadharNo;
        this.initialBalance = initialBalance;
        this.mobNo = mobNo;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", simType='" + simType + '\'' +
                ", aadharNo=" + aadharNo +
                ", initialBalance=" + initialBalance +
                ", validity=" + validity +
                ", mobNo=" + mobNo +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getInitialBalance() {
        return initialBalance;
    }

    public int getValidity() {
        return validity;
    }

    public long getMobNo() {
        return mobNo;
    }
}
