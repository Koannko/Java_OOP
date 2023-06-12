import java.io.IOException;

public class Program {

    /**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
     */
    public static void main(String[] args) throws IOException {
        Box<Fruit> fruitBoxWithApples = new Box<>();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        fruitBoxWithApples.addFruit(apple1);
        fruitBoxWithApples.addFruit(apple2);
        fruitBoxWithApples.addFruit(apple3);
        System.out.println(fruitBoxWithApples.toString()); // Kind of fruit: apple;	Number: 3	Weight: 3.0

        Orange orange1 = new Orange();
        fruitBoxWithApples.addFruit(orange1); // It is not possible to add a fruit of this kind to this box

        Orange orange2 = new Orange();
        Box fruitBoxWithOranges = new Box<>();
        fruitBoxWithOranges.addFruit(orange1);
        fruitBoxWithOranges.addFruit(orange2);
        System.out.println(fruitBoxWithOranges); // Kind of fruit: orange;	Number: 2	Weight: 3.0

        boolean isEqual = fruitBoxWithApples.compare(fruitBoxWithApples); // true
        System.out.println(isEqual ? "These boxes are equals." : "These boxes aren't equals."); // These boxes are equals.

        fruitBoxWithApples.transferFruit(fruitBoxWithOranges); // It is impossible to transfer fruit from this box to the proposed box

        Box<Fruit> fruitBoxWithApples2 = new Box<>();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();
        fruitBoxWithApples2.addFruit(apple5);
        fruitBoxWithApples2.addFruit(apple6);

        fruitBoxWithApples.transferFruit(fruitBoxWithApples2);
        System.out.println(fruitBoxWithApples.toString()); // Kind of fruit: indefinite;	Number: 0	Weight: 0.0
        System.out.println(fruitBoxWithApples2.toString()); // Kind of fruit: apple;	Number: 5	Weight: 5.0

        fruitBoxWithApples.transferFruit(fruitBoxWithApples2);
    }

}
