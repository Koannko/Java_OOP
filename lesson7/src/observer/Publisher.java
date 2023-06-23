package observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private List<Observer> observers;

    public Publisher() {
        observers = new ArrayList<>();
    }


    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void sendOffer(String companyName, double salary) {
        System.out.println("New job offer from " + companyName + ": Salary " + salary);
        notifyObservers(companyName, salary);
    }

    private void notifyObservers(String companyName, double salary) {
        for (Observer observer : observers) {
            observer.update(companyName, salary);
        }
    }
}
