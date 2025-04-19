package Strings;

public class stringMethods {
    public static void main(String[] args){
        String name = "Glenn Maxwell";
        int length = name.length();
        System.out.println(length);
        char c = name.charAt(8);
        System.out.println(c);
        String name2 = "Glenn maxwell";
        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));
        System.out.println('M' + 0);
        System.out.println('m' + 0);
        System.out.println(name.compareTo(name2 ));// Ans: -32
        System.out.println(name.compareToIgnoreCase(name2)); // Ans: 0
        System.out.println("a = "+ (int) 'a');

        /*Because compareTo method takes the first different chars,
        here it is 'M'(77) and 'm'(109) and results in M.compare(m)
        M - m = 77 - 109 = -32  .

        if m.compare(M)
         m - M = 109 - 77 = 32 . */
        String substr = name.substring(6);
        String substr2 = name.substring(6, 9);
        System.out.println(substr);
        System.out.println(substr2);
        String name3 = "    Michael Jacksonville    ";
        System.out.println(name3);
        System.out.println(name3.trim());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        String new_sirname = name.replace("Maxwell", "Smith");
        System.out.println(name.replace("l", "be"));
        System.out.println(new_sirname);
        System.out.println(name.contains("Max"));
        System.out.println(name.contains("max"));
        System.out.println(name.contains("M"));
        System.out.println(name.startsWith("Glenn"));
        System.out.println(name.endsWith("well"));
        System.out.println(name.indexOf('a'));
        System.out.println(name.indexOf("ll")); // Ans 11
        System.out.println(name.lastIndexOf("ll")); // Ans 11
        System.out.println(name.lastIndexOf("l")); // Ans 12

        String formattedString = String.format(
                "My name is %s and my age is %d.", "Glenn", 19
        );
        System.out.println(formattedString);
    }
}
