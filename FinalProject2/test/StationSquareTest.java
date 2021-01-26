import ge.edu.btu.Passenger;
import ge.edu.btu.Train;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StationSquareTest {
    @Test
    public void haveTicketTest(){
        Passenger luka = new Passenger("luka", true);
        assertEquals(true, luka.haveTicket());
    }

    @Test
    public void haveNoTicketTest(){
        Passenger luka = new Passenger("luka", false);
        assertEquals(false, luka.haveTicket());
    }

    @Test
    public void onTheTrainTest(){
        Passenger luka = new Passenger("luka", true);
        Train train = new Train();
        train.addPassenger(luka);
        assertEquals(true, train.getPassengerList().contains(luka));
    }

    @Test
    public void notOnTheTrainTest(){
        Passenger luka = new Passenger("luka", false);
        Train train = new Train();
        train.addPassenger(luka);
        assertEquals(false, train.getPassengerList().contains(luka));
    }
}