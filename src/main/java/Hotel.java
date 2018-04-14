import java.util.ArrayList;

public class Hotel {

    String name;
    ArrayList<Guest> guestList;
    ArrayList<Bedroom> bedrooms;

    public Hotel(String name, ArrayList<Bedroom> bedrooms){
        this.name = name;
        this.guestList = new ArrayList<>();
        this.bedrooms = bedrooms;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfBedrooms() {
        return bedrooms.size();
    }

    public int howManyGuests() {
        return guestList.size();
    }

    public void checkInGuest(Guest guest){
        this.guestList.add(guest);
    }

    public void checkOutGuest(Guest guest) {
        if (guestList.size() > 0) ;
        { this.guestList.remove(guest); }
    }


}
