public class Tryroot {

    public static void main(String[] args) throws InterruptedException {



        // String is not changeable-immutable

        String str = "Daria";
        System.out.println("1.Print: " + str); //Daria

        // When println str String, It is nothing change here. String is an immutable for security.
        str.replace("a", "e").toLowerCase();
        System.out.println("2.Print: " + str); //Daria

        System.out.println("3.Print: " + str.replace("a", "e").toLowerCase()); //

        System.out.println("4.Print: " + str); //Daria

        int t =10;
        System.out.println(str.toUpperCase());

        str.wait(10);
        System.out.println("azadi");



//        System.out.println("2. Print: " + str.replace("E", "A").toLowerCase()); //dan
//

//
//        //Create new String and assign previous String which is "str"
//        str = str.replace("E", "A").toLowerCase();
//        System.out.println("4. Print: " + str); //dan
//        // But here, we assign new value for str String


    }

}
