class Room {
    public void open() {
        System.out.println("Wellcome To Room!");
    }
}

class House {
    private Room room; // Composition - Room is composed of a Window

    public House() {
        room = new Room(); // The Window object cannot exist outside the Room 
    }

    public void show() {
        System.out.println("House with a room:");
        room.open(); 
    }
}

public class Compositon {
    public static void main(String[] args) {
        House myRoom = new House();
        myRoom.show(); 
    }
}