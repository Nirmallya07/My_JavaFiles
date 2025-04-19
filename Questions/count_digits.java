package Questions;
import java.util.Scanner;
public class count_digits {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = 0;
        while (true){
            if(n == 0) break;
            n = n/10;
            i++;
        }
        System.out.print(i);
    }
}