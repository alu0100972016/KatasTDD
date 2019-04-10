package java.cinema;

import org.junit.Assert;
import org.junit.Test;

public class CardTicketTest {
    private CardTicket card;

    @Test
    public void shouldReturnPriceOfTicket() {
        card = CardTicket.Make(15, 0.9);
        Assert.assertEquals(13.5, card.getPrice(), 0.1);
        Assert.assertEquals(12.15, card.getPrice(), 0.1);
    }
}
