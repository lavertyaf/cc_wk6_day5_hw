public class Bedroom extends Room{

    RoomType roomType;
    double rate;

    public Bedroom(String name, RoomType roomType, double rate ){
        super(name);
        this.roomType = roomType;
        this.rate = rate;
    }

    public RoomType getRoomType() {
        return this.roomType;
    }

    public double getRate() {
        return this.rate;
    }
}
