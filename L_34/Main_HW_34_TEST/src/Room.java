public class Room {
    private String number;
    private RoomType type;
    private int capacity;



    public Room(String number, RoomType type, int capacity) {
        this.number = number;
        this.type = type;
        this.capacity = capacity;
    }

    public String getNumber() {
        return number;
    }

    public RoomType getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Коината №'" + number + "' " + type + ", мест:" + capacity;
    }
}
