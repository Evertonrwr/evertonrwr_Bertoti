import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        Ticket ticket = new Ticket(0, 0 , null);
        System.out.print("Welcome to our ticket store! These are the tickets avaiable:");
        System.out.println("\n1 - Opera show;" + "\n2 - Bruno Mars concert;" + "\n3 - Sam Smith concert;");
        System.out.println("Please choese one of our option by typing it down or type 0 do end the service.");
        System.out.print("Option:");
          // using jas.nextInt());
        Integer option = s.nextInt();
        while(option >5){
            System.out.print("Please select one of the options listed above.");
            System.out.print("Option:");
            option = s.nextInt();
        }
        System.out.print("Quantity:");
        var quantity = s.nextInt();
        while(quantity == 0){
            System.out.print("Quantity:");
            quantity = s.nextInt();
        }


            if( option == 1){
                ticket.Quantity = quantity;
                ticket.concertTicket = new FreeTicket();
                ticket.getTicket();}
            else if(option == 2) {
                ticket.Price = 385.0;
                ticket.Quantity = quantity;
                ticket.concertTicket = new PaidTicket();
                ticket.getTicket();
            }else if (option ==3) {
                ticket.Price = 285.0;
                ticket.Quantity = quantity;
                ticket.concertTicket = new PaidTicket();
                ticket.getTicket();
            }else{

                System.out.print("Thank you for buying with us!");
            }



    }
}
