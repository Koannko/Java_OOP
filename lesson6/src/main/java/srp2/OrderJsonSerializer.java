package srp2;

import java.io.FileWriter;
import java.io.IOException;

public class OrderJsonSerializer implements JsonSerializer {
    private Order order;

    public OrderJsonSerializer(Order order) {
        this.order = order;
    }

    @Override
    public void serializeToJson() {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ order.getClientName() + "\",\n");
            writer.write("\"product\":\""+ order.getProduct() + "\",\n");
            writer.write("\"qnt\":"+ order.getQnt() + ",\n");
            writer.write("\"price\":"+ order.getPrice() + "\n");
            writer.write("}\n");
            writer.flush();
            System.out.println("Order serialized to JSON successfully.");
        } catch (IOException ex) {
            System.out.println("Failed to serialize order to JSON: " + ex.getMessage());
        }
    }
}
