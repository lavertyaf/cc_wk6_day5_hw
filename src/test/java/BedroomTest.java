import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

        Bedroom bedroom1;
        Bedroom bedroom2;
        Bedroom bedroom3;
        Bedroom bedroom4;
        Bedroom bedroom5;
        Guest guest1;
        ArrayList<Guest> guests;

    @Before
    public void before(){
        bedroom1 = new Bedroom("McDonald", RoomType.DOUBLE, 75.00);
        bedroom2 = new Bedroom("Stewart", RoomType.FAMILY, 125.00);
        bedroom3 = new Bedroom("Douglas", RoomType.SINGLE, 50.00);
        bedroom4 = new Bedroom("Campbell", RoomType.QUAD, 110.00);
        bedroom5 = new Bedroom("Bruce", RoomType.TRIPLE, 90.00);
        guest1 = new Guest("James");
        guests = new ArrayList<>();
    }

    @Test
    public void getName(){
        assertEquals("Douglas", bedroom3.getName());
    }

    @Test
    public void getRoomType() {
        assertEquals(RoomType.DOUBLE, bedroom1.getRoomType());
    }

    @Test
    public void getRate() {
        assertEquals(90.00, bedroom5.getRate(), 0.01);
    }

    @Test
    public void canAddAGuestToRoom(){
        bedroom1.addAGuestToARoom(guest1);
        assertEquals(1, bedroom1.numberOfGuests());
    }

    @Test
    public void canGetGuests(){
        bedroom1.addAGuestToARoom(guest1);
        assertEquals(guests, bedroom1.getGuests());
    }

}
