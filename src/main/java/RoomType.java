public enum RoomType {

    DOUBLE(2),
    SINGLE(1),
    TRIPLE(3),
    QUAD(4),
    FAMILY(5);

    private int roomType;

    RoomType(int roomType) {
        this.roomType = roomType;
    }

    public int getRoomType() {
        return roomType;
    }

}


