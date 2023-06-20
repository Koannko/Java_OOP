package task2;

public class OrderJsonSerializer implements JsonSerializer {
    private OrderApplication order;

    public OrderJsonSerializer(OrderApplication order) {
        this.order = order;
    }

    @Override
    public void serializeToJson() {
        // Логика сериализации заказа в JSON
        // ...
    }
}

