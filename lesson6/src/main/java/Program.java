import srp2.*;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputProvider inputProvider = new ScannerInputProvider(scanner);

        Order order = new Order("Maria", "pasta", 4, 500);
        order.inputFromConsole(inputProvider);

        JsonSerializer jsonSerializer = new OrderJsonSerializer(order);
        jsonSerializer.serializeToJson();
    }
}

