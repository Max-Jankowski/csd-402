// Max Jankowski
// CSD-402
// Module 10 assignment part 4
// application to create division instances


// Simple application that creates and calls o display 4 instances of division 2 domestic and 2 international
public class UseDivision {

    public static void main(String[] args) {

        // Creating 2 instances of InternationalDivision, one in europe and one in asia
        InternationalDivision intDiv1 = new InternationalDivision("Europe Operations", 11001, "Germany", "German");
        InternationalDivision intDiv2 = new InternationalDivision("Asia HQ", 12002, "Japan", "Japanese");

        // Making 2 instances of DomesticDivision or local stateside offices
        DomesticDivision domDiv1 = new DomesticDivision("Midwest Hub", 22001, "Illinois");
        DomesticDivision domDiv2 = new DomesticDivision("South Western Office", 32002, "Texas");

        // Calling display() on required division, polymorphism allows for the routing to the correct subclass version
        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}
