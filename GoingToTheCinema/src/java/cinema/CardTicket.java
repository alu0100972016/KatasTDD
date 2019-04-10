package java.cinema;

public class CardTicket implements Ticket{
    private final double percentageOff;
    private double price;

    public static CardTicket Make(double price, double percentageOff){
        return new CardTicket(price, percentageOff);
    }

    public CardTicket(double price, double percentageOff) {
        this.price = price;
        this.percentageOff = percentageOff;
    }

    @Override
    public double getPrice() {
        calculateTicketPrice();
        return price;
    }

    private void calculateTicketPrice() {
        price = price * percentageOff;
    }
}
