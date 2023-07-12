package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Room room = new Room(9.5, 21, true, 18.5);
        System.out.println(room.decreaseTemperature());
        System.out.println(room.getRoomInfo());
        System.out.println(room.decreaseTemperature());
        System.out.println(room.getRoomInfo());
        System.out.println(room.decreaseTemperature());
        System.out.println(room.getRoomInfo());
    }
}
