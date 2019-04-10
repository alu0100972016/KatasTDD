package java.cinema;

import org.junit.Assert;
import org.junit.Test;

public class CinemaAppTest {
    private CinemaApp app;

    @Test
    public void calculateTimesMustGoToTheCinemaWithCardToBeCheaperThanNormalTicket(){
        app = CinemaApp.Make(500, 15, 0.9);
        Assert.assertEquals(43, app.calculateTimesToCinema());
        app = CinemaApp.Make(100, 10, 0.95);
        Assert.assertEquals(24, app.calculateTimesToCinema());
    }
}
