package ru.geekbrains.lesson2.lab2;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
        }
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
        }
    }
}
