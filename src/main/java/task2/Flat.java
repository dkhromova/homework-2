package task2;

public class Flat {
    String address;
    int number;
    Room room; // добавим существующую комнату в квартиру, которая была инициирована в классе Room

    public Flat(String address, int number, Room room) {
        this.address = address;
        this.number = number;
        this.room = room;
    }
}
