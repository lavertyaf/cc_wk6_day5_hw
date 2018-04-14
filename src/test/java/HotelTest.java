import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Bedroom bedroom4;
    Bedroom bedroom5;
    ArrayList<Guest> guestList;
    ArrayList<Guest> guests;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;

    @Before
    public void before(){
        bedroom1 = new Bedroom("McDonald", RoomType.DOUBLE, 75.00);
        bedroom2 = new Bedroom("Stewart", RoomType.FAMILY, 125.00);
        bedroom3 = new Bedroom("Douglas", RoomType.SINGLE, 50.00);
        bedroom4 = new Bedroom("Campbell", RoomType.QUAD, 110.00);
        bedroom5 = new Bedroom("Bruce", RoomType.TRIPLE, 90.00);
        ArrayList<Bedroom> bedrooms = new ArrayList<>();
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        bedrooms.add(bedroom3);
        bedrooms.add(bedroom4);
        bedrooms.add(bedroom5);
        hotel = new Hotel("The Clansman", bedrooms);
        guest1 = new Guest("Keith");
        guest2 = new Guest("Alex");
        guest3 = new Guest("Pawel");
        guest4 = new Guest("Sandy");
        ArrayList<Guest> guestList = new ArrayList<>();

    }

    @Test
    public void hasName(){
        assertEquals("The Clansman", hotel.getName());
    }

    @Test
    public void countBedrooms(){
        assertEquals(5, hotel.getNumberOfBedrooms());
    }

    @Test
    public void countGuests(){
        assertEquals(0, hotel.howManyGuests());
    }

    @Test
    public void canCheckInAGuest(){
        hotel.checkInGuest(guest1);
        assertEquals(1, hotel.howManyGuests());
    }

    @Test
    public void canCheckOutAGuest(){
        hotel.checkInGuest(guest2);
        hotel.checkInGuest(guest3);
        hotel.checkOutGuest(guest2);
        assertEquals(1, hotel.howManyGuests());
    }

    @Test
    public void canAddAGuestToAParticularRoom(){
        hotel.addAGuestToPArticularRoom(guest2, bedroom1);
        assertEquals(1, bedroom1.numberOfGuests());
    }

    @Test
    public void canGetGetListForRoom(){
        bedroom1.addAGuestToARoom(guest2);
        bedroom1.addAGuestToARoom(guest3);
        assertEquals(2, hotel.getGuestList(bedroom1).size());
    }
}