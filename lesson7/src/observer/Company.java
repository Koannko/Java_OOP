package observer;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Company {

    private static Random random = new Random();
    private String companyName;
    private double maxSalary;

    private Publisher jobAgency;


    public Company(String companyName, double maxSalary, Publisher jobAgency) {
        this.companyName = companyName;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
    }

    public void needEmployee() {
        double salary = random.nextDouble() * (maxSalary - 3000) + 5000;
        jobAgency.sendOffer(companyName, salary);
    }
}
