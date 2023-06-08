package ru.geekbrains.lesson3.task2;

import java.util.Arrays;
import java.util.Random;

public class Program {

    static Random random = new Random();

    /**
     * TODO: Переработать метод generateEmployee в рамках домашнего задания,
     *  метод должен генерировать рабочих (Employee) разных типов.
     *
     * @return
     */
    static Employee generateEmployee() {
        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surnames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};

        int salary = random.nextInt(20000, 80000);
        int age = random.nextInt(18, 65);
        if (random.nextInt() % 2 == 0) {
            return new Worker(names[random.nextInt(2)], surnames[random.nextInt(surnames.length)], salary, age);
        } else {
            return new Freelancer(names[random.nextInt(2)], surnames[random.nextInt(surnames.length)], salary, age);
        }
    }



    /**
     * TODO: Придумать новые состояния для наших сотрудников
     *   Придумать несколько Comparator'ов для сортировки сотрудников
     *   по фамилии + имени или по возрасту + уровню зп.
     *
     * @param args
     */

    public static void comparator(Employee[] employees) {
        Employee tmp;
        for (int i = 0; i < employees.length; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].getAge() > employees[j].getAge()) {
                    tmp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }

        Arrays.sort(employees);

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        comparator(employees);
        System.out.println();
        System.out.println("Список сотрудников, отсортированный по возрасту:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }


    }

}
