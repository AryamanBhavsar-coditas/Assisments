package Evaluation_3;

abstract class Order1{
    int id;
    String desc;

}

class PurchaseOrder1 extends Order1{

    int id;
    String desc;
    String CustomerName1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCustomerName1() {
        return CustomerName1;
    }

    public void setCustomerName1(String customerName1) {
        CustomerName1 = customerName1;
    }

    @Override
    public String toString() {
        return "PurchaseOrder1{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                ", CustomerName1='" + CustomerName1 + '\'' +
                '}';
    }
}

class SalesOrder1 extends Order1{

    int id;
    String desc;
    String VendorName1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getVendorName1() {
        return VendorName1;
    }

    public void setVendorName1(String vendorName1) {
        VendorName1 = vendorName1;
    }


    @Override
    public String toString() {
        return "SalesOrder1{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                ", VendorName1='" + VendorName1 + '\'' +
                '}';
    }
}

public class Q2_2 {
    public static void main(String[] args) {

        PurchaseOrder1 purchaseOrder1 = new PurchaseOrder1();
        purchaseOrder1.setId(101);
        purchaseOrder1.setDesc("Good Order");
        purchaseOrder1.setCustomerName1("Aryaman");
        System.out.println(purchaseOrder1);

        PurchaseOrder1 purchaseOrder2= new PurchaseOrder1();
        purchaseOrder2.setId(102);
        purchaseOrder2.setDesc("Good/bad  Order");
        purchaseOrder2.setCustomerName1("Raghav");
        System.out.println(purchaseOrder2);

        PurchaseOrder1 purchaseOrder3= new PurchaseOrder1();
        purchaseOrder3.setId(103);
        purchaseOrder3.setDesc("Bad Order");
        purchaseOrder3.setCustomerName1("Atul");
        System.out.println(purchaseOrder3);

        System.out.println();

        SalesOrder1 salesOrder1 = new SalesOrder1();
        salesOrder1.setId(201);
        salesOrder1.setDesc("Bad Order");
        salesOrder1.setVendorName1("ABC Enterprize");
        System.out.println(salesOrder1);

        SalesOrder1 salesOrder2 = new SalesOrder1();
        salesOrder2.setId(202);
        salesOrder2.setDesc("Best Order");
        salesOrder2.setVendorName1("XYZ Enterprize");
        System.out.println(salesOrder2);

        SalesOrder1 salesOrder3 = new SalesOrder1();
        salesOrder3.setId(203);
        salesOrder3.setDesc("Good Order");
        salesOrder3.setVendorName1("PQR Enterprize");
        System.out.println(salesOrder3);
    }
}
//
//Output-
//
//        PurchaseOrder1{id=101, desc='Good Order', CustomerName1='Aryaman'}
//        PurchaseOrder1{id=102, desc='Good/bad  Order', CustomerName1='Raghav'}
//        PurchaseOrder1{id=103, desc='Bad Order', CustomerName1='Atul'}
//
//        SalesOrder1{id=201, desc='Bad Order', VendorName1='ABC Enterprize'}
//        SalesOrder1{id=202, desc='Best Order', VendorName1='XYZ Enterprize'}
//        SalesOrder1{id=203, desc='Good Order', VendorName1='PQR Enterprize'}