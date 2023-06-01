package ru.geekbrains.lesson1;

public class Chocolate extends Product{

    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Chocolate(String brand, String name, double price, double weight) {
        super(brand, name, price);
        this.weight = weight;
    }

    @Override
    public String displayInfo() {
        return String.format("[Шоколад]%s - %s - %f - [масса нетто: %f]", brand, name, price, weight);
    }
}