package SolidPrinciples;

public class CustomerAccount {

    private String customerName;
    private String address;
    private double price;
    private int quantity;

    public CustomerAccount(String customerName, String address, double price, int quantity){
        this.customerName = customerName;
        this.address = address;
        this.price = price;
        this.quantity = quantity;
    }
 
    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }
    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

}