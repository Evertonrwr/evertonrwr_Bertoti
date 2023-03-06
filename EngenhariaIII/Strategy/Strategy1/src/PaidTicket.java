public class PaidTicket implements ConcertTicket{

    @Override
    public void buyTicket(int quantity, double price) {
        System.out.println("attendant: Sure! The total for " + quantity + " tickets will be: $" + quantity*price);
    }
}
