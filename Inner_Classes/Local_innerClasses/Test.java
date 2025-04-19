package Inner_Classes.Local_innerClasses;

public class Test {
    public static void main(String[] args) {

        Hotel hotel1 = new Hotel("Hotel Sea Side", 100, 82);
        System.out.println(hotel1.getReservedRooms());
        hotel1.reserveRoom("Alice", 4);
        System.out.println(hotel1.getReservedRooms());

        Hotel hotel2 = new Hotel("Hotel Elephanta", 50, 48);
        System.out.println("Number of rooms available for " + hotel2.getName()+ " are: " + (hotel2.getTotalRoom() - hotel2.getReservedRooms()));
        hotel2.reserveRoom("Bob", 2);
        System.out.println(hotel2.getReservedRooms());
        hotel2.reserveRoom("Charlie", 1);
        System.out.println(hotel2.getReservedRooms());
    }
}
