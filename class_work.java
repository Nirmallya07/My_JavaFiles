class Person{
    String name;
    public Person(String name){
        this.name = name;
    }
    public void display(){
        System.out.println(this.name);
    }

}

class Student extends Person{
    int rollNo;

    public Student(String name, int rollNo){
        super(name);
        this.rollNo = rollNo;
    }
}