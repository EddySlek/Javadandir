package den;

public class FirstClass extends SecondClass {

    public static void main(String[] args) {

        // 1) Just Extends: call global(static) fields
        System.out.println(colorPublicStatic);
        System.out.println(colorPublicStatic);
        System.out.println(COLOR_PUBLIC_STATIC_FINAL);
        staticMethod();

        // 2) Just Object: call non-static fields(No global fields)
        SecondClass ob = new SecondClass();
        System.out.println(ob.colorNbr);
        System.out.println(ob.colorPublic);
        System.out.println(ob.colorString);
        ob.nonStaticMethod();

        // 3) Extends + Object = You can use all types of fields and method in the class




    }
}
