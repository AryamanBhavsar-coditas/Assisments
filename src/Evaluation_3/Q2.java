package Evaluation_3;

abstract class Order{
    abstract void id(int ids);
    abstract void description(String desc);
}

class PurchaseOrder extends Order {


    int id;
    String desc,CustomerName,VendorName;

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public void setVendorName(String vendorName) {
        VendorName = vendorName;
    }

    @Override
    void id(int ids) {
        this.id = ids;
    }

    @Override
    void description(String desc) {
        this.desc = desc;
    }


    @Override
    public String toString() {
        return "PurchaseOrder{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                ", CustomerName='" + CustomerName + '\'' +
                ", VendorName='" + VendorName + '\'' +
                '}';
    }
}


class SalesOrder extends Order{

    int id;
    String desc,CustomerName,VendorName;;

    @Override
    void id(int id) {
    this.id= id;
    }

    @Override
    void description(String desc) {
    this.desc=desc;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public void setVendorName(String vendorName) {
        VendorName = vendorName;
    }

    @Override
    public String toString() {
        return "SalesOrder{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                ", CustomerName='" + CustomerName + '\'' +
                ", VendorName='" + VendorName + '\'' +
                '}';
    }

}

public class Q2 {
    public static void main(String[] args) {

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.setCustomerName("Aryaman");
        purchaseOrder.setVendorName("XYZ Enterprize");
        purchaseOrder.id(201);
        purchaseOrder.description("Good order");

        System.out.println(purchaseOrder);

        SalesOrder salesOrder = new SalesOrder();
        salesOrder.id(23);
        salesOrder.description("First sales");
        salesOrder.setCustomerName("Ram Singh");
        salesOrder.setVendorName("ABC Enterprize");

        System.out.println(salesOrder);


    }
}
//
//Output-
//        PurchaseOrder{id=201, desc='Good order', CustomerName='Aryaman', VendorName='XYZ Enterprize'}
//        SalesOrder{id=23, desc='First sales', CustomerName='Ram Singh', VendorName='ABC Enterprize'}

