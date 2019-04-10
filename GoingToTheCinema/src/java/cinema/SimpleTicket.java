package cinema;

public class SimpleTicket implements Ticket {
    private double price;

    public static SimpleTicket Make(double price){
        return new SimpleTicket(price);
    }

    private SimpleTicket(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return Math.ceil(price);
    }

}
