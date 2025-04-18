package Strings;

public class string_basic {
    public static void main(String[] args){
        char[] str;
        str = new char[5];
        str[0] = 'C';
        str[1] = 'z';
        str[2] = 'a';
        str[4] = 'r';
        for(char i : str){
            System.out.println(i);
        }
        int a = 'A';
        char b = 10084;
        System.out.println(a + " " + b);

        //OR

        String name = new String();
        name = " Glenn ";
        //OR
        String name1 = new String(" Alice ");
        System.out.println(name);
        System.out.println(name1);

    }
}
