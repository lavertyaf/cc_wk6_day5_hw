import java.util.ArrayList;

public class DiningRoom extends Room {

    String name;
    ArrayList<Guest> diners;
    int capacity;


    public DiningRoom(String name, int capacity) {
        super(name);
        this.diners = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int howManyPeopleInDiningRoom() {
        return this.diners.size();
    }
}
