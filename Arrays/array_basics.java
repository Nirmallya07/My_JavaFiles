package Arrays;

public class array_basics {
    public static void main(String[] args) {
        /* arr is a reference variable to the first
         element of the array and this variable is
         stored in the stack area whereas, the array
         elements are stored in the heap area */
        char[] arr = new char[10];
//        System.out.println(arr); // Prints the hexadecimal address of the 1st element.
        arr[0] = 'A';
        arr[1] = 'B';
        arr[2] = 'C';
        arr[3] = 'D';
        arr[4] = 'E';
        arr[5] = 'F';
        arr[6] = 'G';
        arr[7] = 'H';
        arr[8] = 'I';
        arr[9] = 'J';
        System.out.println(arr); // Prints the array as it is !! New Concept!
        // In Java, char type array behaves differently.
        int[] arr1 = new int[5];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;

        for(int i = 0; i< arr1.length; i++){ // FOR LOOP
            System.out.println(arr1[i]);
        }
        for(int i : arr1){ // FOR EAACH LOOP // Only works for arrays.
            System.out.println(i);
        }

        System.out.println(arr1); // This prints the hexadecimal address of the 1st decimal of the array in hashcode format;
//        Ans --> [I@7b23ec81
        /*
            [ indicates it is an array.
            I → Indicates an integer array.
            7b23ec81 → This is the hashcode (not the actual memory address, but a representation of it).
        */
        /*
            Here, arr is a reference variable that stores the memory address of the array.
            int arr[] = new int[5];
            The actual array [0, 0, 0, 0, 0] is created in the heap memory.
            The reference (address) is stored in the stack memory.
        */

        System.out.println(Integer.toHexString(arr.hashCode())); // Converts the hashcode to hexadecimal

    }
}
