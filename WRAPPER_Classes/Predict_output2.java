package WRAPPER_Classes;

class Student2 {
    int a;
}

public class Predict_output2 {

    public static void fun(Student2 s) {
        s.a = 2;
    }
    public static void main(String[] args) {
        Student2 x = new Student2();
        x.a = 1;
        fun(x);
        System.out.println(x.a);
    }
    // Output: 2
}