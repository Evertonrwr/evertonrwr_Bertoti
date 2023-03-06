import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
            System.out.println("Costumer: Hey! Can i please have two tickets for today's opera show? ");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Ticket ticket = new Ticket(2, 0, new FreeTicket());
            ticket.getTicket();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Costumer: Cool! Can i also get two tickets for Bruno Mars concert?");

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ticket.setConcertTicket(new PaidTicket());
            ticket.Price = 300.0;
            ticket.getTicket();



    }
}
