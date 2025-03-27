public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order("John Doe", "123 Main St", 10.0, 2, "johndoe@example.com");

        Calculate priceCalculator = new Calculator();
        OrderRepository orderRepository = new FileOrder();
        InvoiceGenerator invoiceGenerator = new FileInvoiceGenerator();
        Notification notificationService = new EmailNotification();

        OrderProcessor orderProcessor = new OrderProcessor(
                priceCalculator,
                orderRepository,
                invoiceGenerator,
                notificationService
        );

        orderProcessor.processOrder(order, "order_123.pdf");
    }
}
