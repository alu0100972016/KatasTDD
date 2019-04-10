package cinema;

import org.junit.Assert;
import org.junit.Test;

public class SimpleTicketTest {
    private SimpleTicket ticket;

    @Test
    public void shouldReturnPriceOfTicket() {
        ticket = SimpleTicket.Make(15);
        Assert.assertEquals(15, ticket.getPrice(), 0.1);
        ticket = SimpleTicket.Make(9);
        Assert.assertEquals(9, ticket.getPrice(), 0.1);
    }
}
