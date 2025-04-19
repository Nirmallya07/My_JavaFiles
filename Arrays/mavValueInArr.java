package Arrays;

public class mavValueInArr {
    public static void main(String[] args) {
        int[] arr = { 2, 12, 4322, -32, 22};

        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        int minVal = Integer.MAX_VALUE;
        for (int i : arr) {
            if(i < minVal) {
                minVal = i;
            }
        }
        System.out.println("Maximum Value is " + maxVal);
        System.out.println(("Minimum Value is " + minVal));
    }
}
