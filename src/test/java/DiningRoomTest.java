import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;

    @Before
    public void before(){
        diningRoom = new DiningRoom("The Fountain", 8);
    }

    @Test
    public void getName(){
        assertEquals("The Fountain", diningRoom.getName());
    }

    @Test
    public void getCapacity() {
        assertEquals(8, diningRoom.getCapacity());
    }


    @Test
    public void isDiningRoomEmpty(){
        assertEquals(0, diningRoom.howManyPeopleInDiningRoom());
    }
}
