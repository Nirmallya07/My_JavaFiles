package Arrays;

public class sumOfArrayElements {
    public static void main(String[] args) {
        int[] arr = { 2, 12, 4322, -32, 22};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
