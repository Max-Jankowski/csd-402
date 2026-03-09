// Max Jankowski
// CSD-402
// Module 10 assignment part 1
// Division abstract class


// Abstract class as reading and video specified cannot be instantiated directly, only while using subclasses
public abstract class Division {

    // defining the fields shared by all divisions
    private String divisionName;
    private int accountNumber;

    // A superclass constructor, subclasses must pass both values up to this
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Getters so that subclasses can access private fields
    public String getDivisionName() {
        return divisionName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    // using an abstract method, subclasses are required to provide their own version of this
    public abstract void display();
}