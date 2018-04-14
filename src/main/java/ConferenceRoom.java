import java.util.ArrayList;

public class ConferenceRoom extends Room {

    String name;
    ArrayList<Guest> attendees;
    int capacity;
    double rate;

    public ConferenceRoom(String name, double rate, int capacity){
        super(name);
        this.rate = rate;
        this.attendees = new ArrayList<>();
        this.capacity = capacity;
    }

    public double getRate() {
        return this.rate;
    }

    public int getCapacity() {
        return this.capacity;
    }

}
