package srp2;

import srp2.InputProvider;

public class Order {
    private String clientName;
    private String product;
    private int qnt;
    private int price;

    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public double getPrice() {
        return price;
    }

    public void inputFromConsole(InputProvider inputProvider) {
        clientName = inputProvider.prompt("Client name: ");
        product = inputProvider.prompt("Product: ");
        qnt = Integer.parseInt(inputProvider.prompt("Quantity: "));
        price = Integer.parseInt(inputProvider.prompt("Price: "));
    }
}
