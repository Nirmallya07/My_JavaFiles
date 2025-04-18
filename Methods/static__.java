package Methods;

public class static__ {

    public static int sum(int a, int b){ // Static keyword is used because main is static.
        return a+b;
    }

    public static void main(String[] args) {
        int a = static__.sum(5,4);
        System.out.println(a);
    }
}
