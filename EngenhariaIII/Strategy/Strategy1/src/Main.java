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
            Ticket free = new Ticket(2, 0, new FreeTicket());
            free.getTicket();
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
            Ticket paid = new Ticket(2, 300, new PaidTicket());
            paid.getTicket();


    }
}
