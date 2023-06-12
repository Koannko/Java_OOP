import java.util.ArrayList;


public class Box<T extends Fruit> {

    private ArrayList<T> fruits = new ArrayList<>();

    public ArrayList<T> getFruits() {
        return this.fruits;
    }

    public String getKindOfFruit() {
        try {
            return this.fruits.get(0).toString();
        } catch (IndexOutOfBoundsException e) {
            return "indefinite";
        }
    }

    public void addFruit(T fruit) {
        if (checkContent(fruit)) {
            fruits.add(fruit);
        } else {
            System.out.println("It is not possible to add a fruit of this kind to this box");
        }
    }

    private boolean checkContent(ArrayList<T> fruits, T fruit) {
        if (fruits.isEmpty() || fruit.getClass().equals(fruits.get(0).getClass())) {
            return true;
        } else {
            return false;
        }
    }

    private boolean checkContent(T fruit) {
        if (this.fruits.isEmpty() || fruit.getClass().equals(this.fruits.get(0).getClass())) {
            return true;
        } else {
            return false;
        }
    }

    private boolean removeFruit(Fruit fruit) {
        return this.getFruits().remove(fruit);
    }

    public void transferFruit(Box otherBox) {
        if (this.getFruits().isEmpty()) {
            System.out.println("It is impossible because the box is empty.");
            return;
        }
        T f = this.fruits.get(0);
        if (checkContent(otherBox.getFruits(), f)) {
            while (!this.getFruits().isEmpty()) {
                f = this.fruits.get(0);
                otherBox.addFruit(f);
                this.removeFruit(f);
            }
        } else {
            System.out.println("It is impossible to transfer fruit from this box to the proposed box");
        }
    }

    public int getFruitCount() {
        try {
            return this.getFruits().size();
        } catch (IndexOutOfBoundsException e) {
            return 0;
        }
    }

    public boolean compare(Box otherBox) {
        return Math.abs(this.getBoxWeight() - otherBox.getBoxWeight()) < 0.0001;
    }

    public double getBoxWeight() {
        try {
            return fruits.get(0).getWeight() * fruits.size();
        } catch (IndexOutOfBoundsException e) {
            return 0.0;
        }
    }

    public String toString() {
        return String.format("Kind of fruit: %s;\tNumber: %d\tWeight: %.1f", this.getKindOfFruit(), this.getFruitCount(), this.getBoxWeight());
    }
}
