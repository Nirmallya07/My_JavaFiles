package Methods;
class Cat{
    String name;
 }

public class objectTypeReturnMethod {
    public static Cat makeCatNameUpperCase(Cat a){ // Isko void bhi rak sakthe hain kiuki at address phir bhi same changes honge..
        /* This is call by reference not by value.
        So the address of object 'a' is passed as argument to the function
        here 'a' is 'katse'.  */
        a.name = a.name.toUpperCase();
        /* Here, a.name gets changed to a new string "MEOW" and the original
        string "Meow" as no references by any variable so it gets to garbage collection
        and will get removed by the java garbage collector at some point at future. */
        return a;
    }
    public static void main(String... args) {
        Cat katse = new Cat();
        katse.name = "Meow";
        Cat cat = makeCatNameUpperCase(katse);
        System.out.println(cat.name);
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);
    }
}
