package Questions;
import java.util.*;
public class benjamin_bulbs {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num_bulbs = scn.nextInt();
        int num_toggles = scn.nextInt();
        int i = 1;
        while(i <= num_bulbs){
            int got_toggled = 0;
            int count = 1;
            while(count<=num_toggles){
                if(i%count == 0) got_toggled++;
                count++;
            }
            if(got_toggled%2 != 0) System.out.println("Bulb " + i + " is on.");
            i++;
        }
    }
}