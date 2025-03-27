public class Calculator implements Calculate{
    @Override
    public double calculateTotal(double price, int quantity) {
        return price * quantity;
    }
}
