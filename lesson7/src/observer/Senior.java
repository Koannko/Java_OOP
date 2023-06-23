package observer;
import java.util.Random;
public class Senior implements Observer {
    private static Random random = new Random();
    private String name;

    private double minSalary;

    public Senior(String name) {
        this.name = name;
        minSalary = random.nextDouble() * 6000 + 10000;
    }
    @Override
    public void receiveOffer(String companyName, double salary) {
        if (minSalary <= salary){
            System.out.printf("Синер %s (%f) >>> Соглашусь у вас задержаться! [%s - %f]\n",
                    name, minSalary, companyName, salary);
            minSalary = salary;
        }
        else {
            System.out.printf("Синер %s >>> Я найду работу получше (%f)! [%s - %f]\n",
                    name, minSalary, companyName, salary);
        }
    }
}
