package SolidPrinciples;

public class SendNotificatin implements EmailNotification{
    @Override
    public void sendEmailNotification(String email) {
      // Simulate sending email notification
      System.out.println("Email notification sent to: " + email);
    }
}
