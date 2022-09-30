public class mainn {
    public static void main(String[] args) {
    ticketDestination ticketDestination =new ticketDestination("Astana-New-York","available");
    traveler Alex=new traveler("Alex");
    traveler Ali=new traveler("Ali");
    traveler Bali=new traveler("Bali");
        ticketDestination.addObserver(Alex);
        ticketDestination.addObserver(Ali);
        ticketDestination.addObserver(Bali);
        ticketDestination.setStatus("available");
        System.out.println(ticketDestination.getTicket()+" flight status changed to "+ ticketDestination.getStatus());
    }
}
