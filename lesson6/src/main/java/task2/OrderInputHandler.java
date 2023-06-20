package task2;

import java.util.Scanner;

public class OrderInputHandler {
    private Scanner scanner;

    public OrderInputHandler() {
        scanner = new Scanner(System.in);
    }

    public OrderApplication getOrderFromConsole() {
        String clientName = prompt("Client name: ");
        String product = prompt("Product: ");
        int quantity = Integer.parseInt(prompt("Quantity: "));
        int price = Integer.parseInt(prompt("Price: "));

        return new OrderApplication(clientName, product, quantity, price);
    }

    private String prompt(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }
}

