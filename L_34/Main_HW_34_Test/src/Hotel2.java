import java.util.ArrayList;
import java.util.List;

public enum Hotel2 {
    INSTANCE;

    private List<Room> roomList;


    private void readRoom(){
        // читаем список из базы данных
        roomList = new ArrayList<>();
        roomList.add(new Room("1",RoomType.STANDART,2));
        roomList.add(new Room("2",RoomType.STANDART,2));
        roomList.add(new Room("3",RoomType.JUNIOR,1));
        roomList.add(new Room("4",RoomType.DELUXE,3));
        roomList.add(new Room("5",RoomType.DELUXE,3));
        roomList.add(new Room("6",RoomType.DELUXE,2));
        roomList.add(new Room("7",RoomType.STUDIO,3));
        roomList.add(new Room("8",RoomType.PRESIDENT,4));
        roomList.add(new Room("9",RoomType.SUITE,2));
        roomList.add(new Room("10",RoomType.SUITE,1));
    }

    private Hotel2() {
        readRoom();
    }



    @Override
    public String toString() {
        String result="";
        for (Room room: roomList){
            result+= room+System.lineSeparator();
        }
        return result;
    }

    public List<Room> roomsByType(RoomType type){
        List<Room> result = new ArrayList<>();
        for (Room room: roomList){
            if(room.getType()==type){
                result.add(room);
            }
        }
        return result;
    }

}

