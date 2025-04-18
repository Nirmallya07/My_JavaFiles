package Questions;

public class hello {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        int a = 2147483646;
        long b = 9223372039950L;
        System.out.println(a);
        System.out.println(b);
        int narrowingConversion = (int) b;
        System.out.println(narrowingConversion);
//        System.out.println(a + b);
//        int c = 97;
//        System.out.println((char) c);
//       for (int i = 0; i<=10; i++){
//           System.out.println(i + " = " + (char) i);
//       }
//        System.out.println("10082 = ❢ 10083 = ❣ 10084 = ❤ 10085 = ❥" );
        System.out.println(Integer.toBinaryString(20));
    }
}
