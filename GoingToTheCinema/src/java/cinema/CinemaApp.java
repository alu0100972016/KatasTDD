package java.cinema;

public class CinemaApp {
    private SimpleTicket simpleTicket;
    private CardTicket cardTicket;
    private double cardPrice;


    public static CinemaApp Make(double cardPrice, double ticketPrice, double percentageOff){
        return new CinemaApp(cardPrice, ticketPrice, percentageOff);
    }

    private CinemaApp(double cardPrice, double ticketPrice, double percentageOff){
        this.simpleTicket = SimpleTicket.Make(ticketPrice);
        this.cardTicket = CardTicket.Make(ticketPrice, percentageOff);
        this.cardPrice = cardPrice;
    }

    public int calculateTimesToCinema() {
        double simpleTicketPrice = simpleTicket.getPrice();
        double cardTicketPrice = cardPrice + cardTicket.getPrice();
        int timesToGo = 1;

        while (simpleTicketPrice <= Math.ceil(cardTicketPrice)){
            timesToGo++;
            simpleTicketPrice += simpleTicket.getPrice();
            cardTicketPrice += cardTicket.getPrice();
        }

        return timesToGo;
    }

}
