//class work 
//you have been asked to develop solution to create multiple ticket counter. Each ticket counter should have counter number, no_of_tickets to be sold and ticket officer name. Analyze and build the solution using relevent concepts.
class TicketCounter
{
    int counterNumber;
    int noOfTickets;
    String ticketOfficer;
    TicketCounter(int counterNumber, int noOfTickets, String ticketOfficer){
    this.counterNumber=counterNumber;
    this.noOfTickets=noOfTickets;
    this.ticketOfficer=ticketOfficer;
    }
    void details(){
            System.out.println("counter Number:"+counterNumber+"no of Tickets :"+noOfTickets+"ticket Officer name :"+ticketOfficer);
    }

    void buyTickets(int tickets){
        if(tickets>noOfTickets){
            System.out.println("failed, due to insufficient tickets in counter");
            
        }
        else{
            System.out.println("successfull purchase ");
            noOfTickets=noOfTickets-tickets;
            System.out.println("available tickets:"+noOfTickets);
        }
    }
} 
class Program3
{
    public static void main(String[] args)
    {
        System.out.println("main method started");
       

        TicketCounter t1=new TicketCounter(001,100,"pradeep");
        t1.details();
        TicketCounter t2=new TicketCounter(002,200,"suresha");
        t2.details();
        t1.buyTickets(90);
        
        System.out.println("main method ended");
    }
}
