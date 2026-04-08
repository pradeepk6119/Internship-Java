class TicketCounter 
{
    // Instance variables
    int counterNumber;
    int noOfTickets;
    String ticketOfficerName;

    // Constructor to initialize the ticket counter
    TicketCounter(int counterNumber, int noOfTickets, String ticketOfficerName) 
    {
        this.counterNumber = counterNumber;
        this.noOfTickets = noOfTickets;
        this.ticketOfficerName = ticketOfficerName;
    }

    // Enhancement 1: Display available tickets
    void availableTickets() 
    {
        System.out.println("Counter " + counterNumber + " (" + ticketOfficerName + ") has " + noOfTickets + " tickets available.");
    }

    // Enhancement 2: Buy tickets with validation
    void buyTickets(int requestedTickets) 
    {
        System.out.println("Attempting to buy " + requestedTickets + " tickets from Counter " + counterNumber + "...");
        
        // Check if we have enough tickets
        if (requestedTickets <= noOfTickets) 
        {
            noOfTickets = noOfTickets - requestedTickets; // Deduct the sold tickets
            System.out.println("Success! Tickets bought. Remaining tickets: " + noOfTickets);
        } 
        else 
        {
            System.out.println("Failed! Insufficient tickets. Only " + noOfTickets + " available.");
        }
        System.out.println("------------------------------------------------");
    }
}

public class Program9 
{
    public static void main(String[] args) 
    {
        System.out.println("--- Ticket System Started ---\n");

        // Creating Counter 1 with 10 tickets
        TicketCounter counter1 = new TicketCounter(1, 10, "Alice");
        
        // Creating Counter 2 with 50 tickets
        TicketCounter counter2 = new TicketCounter(2, 50, "Bob");

        // Checking initial availability
        counter1.availableTickets();
        counter2.availableTickets();
        System.out.println("------------------------------------------------");

        // Testing Counter 1 (The scenario from your prompt)
        counter1.buyTickets(5);  // Should succeed, 5 left
        counter1.buyTickets(10); // Should fail, only 5 left

        // Testing Counter 2
        counter2.buyTickets(20); // Should succeed, 30 left
        counter2.availableTickets(); // Check final status of counter 2

        System.out.println("\n--- Ticket System Ended ---");
    }
}