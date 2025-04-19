package Enums;

enum Day { // Enum is nothing but a class.
           // Check photo at Important java info images.

    // First it's constants must be written.
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
    // Every constant is an instance of Day, so objects can be made.

    // As enum becomes a class at the end, so we define methods here like classes.
    public String display() {
        return "Today is " + this.name(); // this referes to the object that is calling this function.
    }

    private String a; // A field at enum can be difined as enum is a class at th end.
}

public class EnumBasic {
    public static void main(String[] args) {
        System.out.println(Day.SUNDAY);
        System.out.println(Day.SUNDAY);
        System.out.println(Day.SUNDAY);
        System.out.println(Day.SUNDAY);
      // Ensuring no mistake (eg : Spelling ) when one is required to write again and again!

        Day monday = Day.MONDAY;
        int index = monday.ordinal(); // This returns the index of monday.
        System.out.println(index);
        System.out.println(monday.name());
        System.out.println(monday.toString());
        System.out.println(monday.compareTo(Day.TUESDAY)); // self ordinal to compared constant ordinal.
//        Thus, 1-2 = -1

        Day enumDay = Day.valueOf("MONDAY"); // Converts monday to enum.
        System.out.println(enumDay);

        System.out.println("---------------------------------------------------");


        // Printing all the constants as elements of arrays.
        Day[] values = Day.values();
        for ( Day i : values) {
            System.out.println(i);
        }

        // Display function called.
        System.out.println(monday.display());

        // Using enum field. // How to use ?
    }
}
