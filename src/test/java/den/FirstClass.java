package den;

public class FirstClass extends SecondClass {

    public static void main(String[] args) {

        // Just Extends: call global(static) fields
//        System.out.println(colorPublicStatic);
//        System.out.println(colorPublicStatic);
//        System.out.println(COLOR_PUBLIC_STATIC_FINAL);

        // Just Object: call non-static fields(No global fields)
        SecondClass ob = new SecondClass();
        System.out.println(ob.colorNbr);
        System.out.println(ob.colorPublic);
        System.out.println(ob.colorString);




    }
}
