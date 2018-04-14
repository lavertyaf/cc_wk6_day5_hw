import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("Smith Suite", 1000.00, 10);
    }

    @Test
    public void getName(){
        assertEquals("Smith Suite", conferenceRoom.getName());
    }

    @Test
    public void getRate() {
        assertEquals(1000.00, conferenceRoom.getRate(), 0.01);
    }

    @Test
    public void getCapacity() {
        assertEquals(10, conferenceRoom.getCapacity());
    }
}
