public class Room {
    private String number;
    private RoomType type;
    private int capacity;

    //Конструктор
    public Room(String number, RoomType type, int capacity) {
        this.number = number;
        this.type = type;
        this.capacity = capacity;
    }

    //Геттеры
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
        return "\uD83C\uDFE8 Комната № " + number + " " + type +
                "\n Количество спальных мест - " + capacity;
    }
}
