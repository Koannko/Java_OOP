package ru.geekbrains.lesson3.task2;

// 20 * 8

/**
 * TODO: Спроектировать класс Freelancer самостоятельно в рамках домашнего задания
 */
public class Freelancer extends Employee{
    public Freelancer(String name, String surname, double salary, int age) {
        super(name, surname, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Среднемесячная заработная плата: %.2f (руб.); %d лет",
                surname, name, calculateSalary(), age);
    }
}
