public class variables{

    public static void main(String [] args){
        int x = 15;
        int y = 10;
        int sum = x + y;

        System.out.println(sum);

        int prod = x*y;
        System.out.println(prod);

        int v1 = x/y;
        int v2 = y/x;
        int v3 = x%y;

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        int exp = (x*y) / (x+y);
        System.out.println(exp);
    }
}