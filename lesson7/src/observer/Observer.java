package observer;

public interface Observer {
    String name = null;
    void receiveOffer(String companyName, double salary);
    public default void update(String companyName, double salary) {
        System.out.println("Job seeker " + this.name + " received a new job offer:");
        System.out.println("Company: " + companyName);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}
