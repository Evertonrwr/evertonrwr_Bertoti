public class FreeTicket implements ConcertTicket {
    @Override
    public void buyTicket(int quantity, double price) {
        System.out.println("Here it Goes. Good News, It's a free concert!");
    }

}
