public class pattern123 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            if (i <= n / 2) {
                for (int j = n / 2; j >= i; j--) {
                    System.out.print("*");
                }
                for (int j = 1; j<=(i-1)*2; j++) {
                    System.out.print(" ");
                }
                for (int j = n / 2; j >= i; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
            else {
                for (int j = n/2 + 1; j <= i ; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j<=(n-i) * 2; j++) {
                    System.out.print(" ");
                }
                for (int j = n/2 + 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();

            }
        }
    }

}