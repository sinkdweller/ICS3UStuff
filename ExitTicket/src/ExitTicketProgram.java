// Exit Ticket

// Evelynn Lu
// mar 17 2024
// Java SE17
// ==============================================================================
// Keep track of orders per group for tickets. Calculate according price for each age for ticket purchased
//==============================================================================
//VARIABLES:
// br for BufferedReader
// newGroup variable condition for new Group order program refresh 
// df to format money to two places
// adults to keep track of number of adult tickets per group (between 12 and 65)
// children to keep track of number of children tickets per group (under 12)
//tickets bought to keep track of tickets bought for each age
//age to keep track of the purchaser's age
//subtotal for subtotal of each group
//total for total of each group (+ tax)


//==============================================================================
//
import java.io.*;//import java library
import java.text.DecimalFormat; //import decimal format library

public class ExitTicketProgram {//start of ExitT

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String newGroup = "y";//Condition to refresh new *group* order

        DecimalFormat df = new DecimalFormat("0.00"); //df to format money 
        
        int age; //Keep track of order age

        do {

            System.out.println("ORDER TICKETS RIGHT NOW!!! DO IT!!!! NOW!!!!");
            System.out.println("Here are your ticket options: ");
            System.out.println("Senior (65 years and over):  free");
            System.out.println("Adult (12-65):               $900");
            System.out.println("Under 12:                    $100");

            String orderAnother = "y"; //condition to add More orders for a group
            
            //These variables refresh at the start of each new group order session
            int adults = 0; 
            int children = 0;
            int ticketsBought = 0;

            
            
            while (orderAnother.equals("y")) { //Add Tickets for a group loop

                System.out.println("Please enter your age (between 2147483647: "); // Ask for Age

                while (true) { // Catch non integer error
                    try {
                        age = Integer.parseInt(br.readLine());
                        while (age <= 0) { // Catch negative age error
                            System.out.println("Please enter a valid age above 0!");
                            age = Integer.parseInt(br.readLine());
                        }

                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Not a valid age/whole number! Try again!");
                    }
                }
                
                
                
                
                
                System.out.println("Please enter how many tickets you wish to buy: "); //Ask for tickets

                while (true) { // Catch not integer error
                    try {
                        ticketsBought = Integer.parseInt(br.readLine());
                        while (ticketsBought <= 0) { // Catch negative ticket count error
                            System.out.println("Please enter a valid number above 0!");
                            ticketsBought = Integer.parseInt(br.readLine());
                        }
                        break;
                        
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter an integer number. How many tickets do you wish to buy?");
                    }
                }

                 

                // Add tickets bought for each age
                if (age < 65) { //Calculate money only if not a senior
	                if (age >= 12) {
	                    adults += ticketsBought;
	                } else if (age >= 0) {
	                    children += ticketsBought;
	                }
                }

                System.out.println("Would you like to order more? Enter 'y' for yes or any other character to quit"); //prompt to order more tickets
                orderAnother = br.readLine();

            }

            double subtotal = adults * 900 + children * 100; //calculate subtotal
            double total = subtotal * 1.13; //calculate taxz
            System.out.println("Your subtotal is:            " + df.format(subtotal)); 
            System.out.println("Your total after taxes is:   " + df.format(total));

            if (adults >= 10) { //calculate adult discount
                System.out.println("-Added discount!!! 10 adults discount -10%");
                total *= 0.9;
            }

            System.out.println("Your grand total is:         $" + df.format(total));

            System.out.println("\nWould you like to order for another group? Enter 'y' for yes, or any other character to exit");
            newGroup = br.readLine();

        } while (newGroup.equals("y"));
        
        
        System.out.println("Yooo thanks for paying");
    }
}
