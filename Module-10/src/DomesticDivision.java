// Max Jankowski
// CSD-402
// Module 10 assignment part 3
// Domestic Division class


// Subclass of division for offices located within the states
public class DomesticDivision extends Division {

    // This field specific to domestic divisions
    private String state;

    // this constructor requires all fields, first two are passed up to the superclass
    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber); // Calls Division's constructor
        this.state = state;
    }

    // An example of concrete implementation of the abstract display() method
    @Override
    public void display() {
        System.out.println("#####  Domestic Division  #####");
        System.out.println("Division Name:  " + getDivisionName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("State:          " + state);
        System.out.println();
    }
}
