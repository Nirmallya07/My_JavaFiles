package Arrays;

public class TwoDarray {
    public static void main(String[] args) {
        int[][] arr = new int[3][2]; // [Rows][Columns]
        arr[0][0] = 1;
        arr[0][1] = 1;
        arr[1][0] = 2;
        arr[1][1] = 2;
        arr[2][0] = 3;
        arr[2][1] = 3;
        for (int[] i : arr){
            for (int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        int[][] arr1 = { // An array of arrays is NOT a JAGGED ARRAY.
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // An array of DIFFERENT LENGTH of arrays are called JAGGED ARRAYS.

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        // Creating array using for loop..

        int count = 1;

        int[][] arr2 = new int[3][4];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++){
                arr2[i][j] = count;
                count++;
            }
            count--;
            count *= 10;
        }

        // Printing arr2

        for (int[] i : arr2) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }

        int count2 = 1;
        int[][][] arr3 = new int[3][4][3]; // It is a jagged array as the sub-arrays are of different lengths (i.e. not a square)
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                for (int k = 0; k < arr3[i][j].length; k++) {
                    arr3[i][j][k] = count2;
                }
                count2++;
            }
        }
        // Printing 3-D Array
        for (int [][] i : arr3) {
            for (int[] j : i) {
                System.out.print("{");
                for (int k : j) {
                    System.out.print(k);
                    System.out.print(",");
                }
                System.out.print("\b},\t");
            }
            System.out.println();
        }
    }
}