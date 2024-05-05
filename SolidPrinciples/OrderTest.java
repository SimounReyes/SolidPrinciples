package SolidPrinciples;
public class OrderTest {

    public static void main(String[] args) {
      CustomerAccount account = new CustomerAccount("John Doe", "123 Main St", 10.0, 2);
      
     OrderAction ordered = new OrderAction();
     SendNotificatin notif = new SendNotificatin();
     Invoice invoice = new Invoice(); 
      
      ordered.calculateTotal(account.getPrice(), account.getQuantity());
      ordered.placeOrder(account.getCustomerName(), account.getAddress());
  
      // These methods might not be needed for all orders
      invoice.generateInvoice("order_123.pdf");
      notif.sendEmailNotification("johndoe@example.com");
    }
  }
  
  