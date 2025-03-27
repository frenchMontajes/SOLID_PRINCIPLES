public class EmailNotification implements Notification {
    @Override
    public void sendEmailNotification(Order order) {
        System.out.println("Email notification sent to " + order.getEmail());
    }
}
