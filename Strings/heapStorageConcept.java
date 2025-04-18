package Strings;

public class heapStorageConcept {
    public static void main(String[] args){
        String a = new String("Ram");
        String b = new String("Ram");
        // a == b compares addresses! Not the string.
        // To compare two strings, just use str1.equals(str2) method from String class.
        // java.lang.String
        System.out.println(a == b); // False, as different addresses for two objects.
        String c = "Ram";
        String d = "Ram";
        System.out.println(c == d); // True
        // Both c and d point towards the same "Ram" in the string pool.
        // c and d is present at the heap storage.
        // As, once the string "Ram" has been created at c.
        // No new "Ram" will be created and d will be assigned the same address as c from the string pool.

    }
}
