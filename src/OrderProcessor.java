public class OrderProcessor {
    private Calculate calculate;
    private OrderRepository orderRepository;
    private InvoiceGenerator invoiceGenerator;
    private Notification notification;


    public OrderProcessor(
            Calculate calculate,
            OrderRepository orderRepository,
            InvoiceGenerator invoiceGenerator,
            Notification notification
    ) {
        this.calculate = calculate;
        this.orderRepository = orderRepository;
        this.invoiceGenerator = invoiceGenerator;
        this.notification = notification;
    }

    public void processOrder(Order order, String fileName) {

        double total = calculate.calculateTotal(order.getPrice(), order.getQuantity());
        System.out.println("Order total: $" + total);

        orderRepository.placeOrder(order);
        invoiceGenerator.generateInvoice(order, fileName);
        notification.sendEmailNotification(order);

    }
}

