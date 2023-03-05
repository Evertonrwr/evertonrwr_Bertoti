import java.util.Date;

public class Ticket{
    public int Quantity;
    public Double Price;
    public ConcertTicket concertTicket;
    public Ticket(int quantity, double ticketPrice, ConcertTicket concertTicketType){
        Quantity = quantity;
        Price = ticketPrice;
        concertTicket = concertTicketType;
    }

    public void getTicket() {
        this.concertTicket.buyTicket(this.Quantity, this.Price);
    }
}
