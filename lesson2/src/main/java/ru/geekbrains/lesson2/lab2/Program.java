package ru.geekbrains.lesson2.lab2;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 5);
        Cat cat2 = new Cat("Мурзик", 8);
        Cat cat3 = new Cat("Том", 12);
        List<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        Plate plate = new Plate(20);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat.getName() + " голоден: " + cat.isHungry());
        }

        plate.addFood(10); // Добавляем еду в тарелку
        plate.info();
    }
}
