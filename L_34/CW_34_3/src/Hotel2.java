import java.util.ArrayList;
import java.util.List;

public enum Hotel2 {
    //Создаю константу екземпляр
    INSTANCE;

    //Создаю поле
    private List<Room> roomList;

    // Создаю КОНСТРУКТОР меняю на конструктор enum:
    Hotel2() {
        readRoom();
    }

    // Создаю Геттеры
    public List<Room> getRoomList() {
        return roomList;
    }

    //Иммитируем порождения комнат
    private void readRoom(){
        //имитация чтения из файла
        roomList= new ArrayList<>();
        roomList.add(new Room("1", RoomType.STANDARD,2));
        roomList.add(new Room("2", RoomType.STANDARD,2));
        roomList.add(new Room("3", RoomType.JUNIOR,1));
        roomList.add(new Room("4", RoomType.DELUXE,2));
        roomList.add(new Room("5", RoomType.DELUXE,2));
        roomList.add(new Room("6", RoomType.DELUXE,3));
        roomList.add(new Room("7", RoomType.STUDIO,3));
        roomList.add(new Room("8", RoomType.PRESIDENT,4));
        roomList.add(new Room("9", RoomType.SUITE,2));
        roomList.add(new Room("10", RoomType.SUITE,2));
    }

    @Override
    public String toString() {
        String result = "";
        for(Room room : roomList){
            result += room + System.lineSeparator(); //System.lineSeparator(); - переходим на след строку
        }
        return result;
    }
}
