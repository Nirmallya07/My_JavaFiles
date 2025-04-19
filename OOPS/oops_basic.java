package OOPS;

class Car{
    public String name;
    public String yearOfRegistration;
    public String colour;
    public String horn;
    protected String rim_colour;
    public int maxSpeed = 100; // By Default
    private int min_speed = 0;
    private int initial_speed = min_speed;
    public void setMin_speed(int x){
        if(x < 0) System.out.println("Speed can't be less than zero.");
        else min_speed = x;
    }
    public int getMin_speed(){
        return min_speed;
    }
    public void accelerate(int x){
        if((x + initial_speed) > maxSpeed){
            initial_speed = maxSpeed;
        }
        else initial_speed += x;
    }
    public void decelerate(int x){
        if(x > initial_speed){
            initial_speed = 0;
        }
        else initial_speed -= x;
    }
    public int getInitial_speed(){
        return initial_speed;
    }


}
public class oops_basic {
    public static void main(String[] args) {

    }
}
