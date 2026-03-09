// Max Jankowski
// CSD-402
// Module 10 assignment part 2
// International Division class


// Subclass of division for offices that are located outside the USA
public class InternationalDivision extends Division {

    // defining fields specific to international divisions lang and country
    private String country;
    private String language;

    // Constructor requires all fields — the first two are passed up to the superclass
    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber); // Calls Division's constructor
        this.country = country;
        this.language = language;
    }

    //  making an abstract display() method
    @Override
    public void display() {
        System.out.println("####   International Division  #####");
        System.out.println("Division Name:  " + getDivisionName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Country:        " + country);
        System.out.println("Language:       " + language);
        System.out.println();
    }
}
