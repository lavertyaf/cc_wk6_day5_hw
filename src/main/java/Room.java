import java.util.ArrayList;

public abstract class Room {

    String name;
    ArrayList<Guest> guests;

    public Room(String name) {
        this.name = name;
        this.guests = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int numberOfGuests() {
        return guests.size();
    }


}
