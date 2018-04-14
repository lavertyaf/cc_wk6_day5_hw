import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;


    @Before
    public void before(){
        guest1 = new Guest("Keith");
        guest2 = new Guest("Alex");
        guest3 = new Guest("Pawel");
        guest4 = new Guest("Sandy");
    }

    @Test
    public void getName(){
        assertEquals("Keith", guest1.getName());
    }

}
