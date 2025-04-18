package Inner_Classes.Local_innerClasses;

public class Hotel {
    private int totalRoom;
    private String name;
    private int reservedRooms;

    public String getName() {
        return name;
    }

    public int getTotalRoom() {
        return totalRoom;
    }

    public int getReservedRooms() {
        return reservedRooms;
    }

    public Hotel(String name, int totalRoom, int reservedRooms) {
        this.name = name;
        this.totalRoom = totalRoom;
        this.reservedRooms = reservedRooms;
    }


    public void reserveRoom(String guestName, int numOfRooms_required) {
        class ReservationValidator {

            boolean validate() {
                if(guestName == null || guestName.isBlank()) {
                    System.out.println("Guest Name cannot be empty.");
                    return false;
                }
                if(numOfRooms_required < 0) {
                    System.out.println("Number of rooms should be positive.");
                    return false;
                }
                if(reservedRooms + numOfRooms_required > totalRoom) {
                    System.out.println("Not enough rooms available.");
                    return false;
                }

                return true;
            }
        }

        ReservationValidator reservationValidator = new ReservationValidator();

        if(reservationValidator.validate()) {
            reservedRooms += numOfRooms_required;
            System.out.println("The room is reseverd for " + guestName + " for " + numOfRooms_required + " rooms.");
            System.out.println("Dear Sir, welcome to " + name);
        } else {
            System.out.println("Reservation failed for customer named " + guestName + ".");
        }
    }
}
