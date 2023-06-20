package task2;

public class OrderApplication {
    private String clientName;
    private String productName;
    private int quantity;
    private int price;
    public OrderApplication(String clientName, String productName, int quantity, int price) {
        this.clientName = clientName;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        OrderInputHandler inputHandler = new OrderInputHandler();
        OrderApplication order = inputHandler.getOrderFromConsole();

        OrderJsonSerializer serializer = new OrderJsonSerializer(order);
        serializer.serializeToJson();
    }
}
