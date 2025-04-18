package Questions;

public class Q_grade_system {
    public static void main(String[] args) {
        int marks;
        marks = 99;

        if (marks > 100 | marks < 0)
            System.out.print("The value of marks is out of range.");
        else if (marks > 90 & marks <= 100){
            System.out.print("Excellent");
        }
        else if (90 >= marks & marks > 80){
            System.out.print("Good");
        }
        else if (marks > 70 & marks <= 80){
            System.out.print("Fair");
        }
        else if (marks > 60 & marks <= 70){
            System.out.print("Meets Expectations");
        }
        else{
            System.out.print("Below par");
        }
    }
     
}
