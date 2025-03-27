public class FileInvoiceGenerator implements InvoiceGenerator {
    @Override
    public void generateInvoice(Order order, String fileName) {
        System.out.println("Invoice generated: " + fileName + " for " + order.getCustomerName());
    }
}
