package WRAPPER_Classes;


class Student {
    int a;
}


public class Predict_output1 {

    public static void fun(Student s) { // 's' gets a copy of the reference.
        Student student = new Student();
        student.a = 2;
        s = student; // Now 's' gets the reference of 'student' obj.
    }

    public static void main(String[] args) {
        Student b = new Student();
        b.a = 1;
        fun(b);
        System.out.println(b.a); // But still b conatains the same reference. so ( b.a = 1 )
    }
}