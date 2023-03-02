package day04;

public class WrapperClass {

    public static void main(String[] args) {

        /**
             Primitive    WrapperClass (Non-Primitive)

             byte         Byte
             short        Short
             int          Integer    *****
             long         Long
             float        Float
             double       Double
             boolean      Boolean
             char         Character   *****
         */


        //Primitive:
        int age = 15;

        //Non-Primitive (Wrapper Class):
        Integer age2 = 25;
        System.out.println(age2.equals(25)); //true

        System.out.println(age2.MAX_VALUE);



    }
}
