package den;

//import static den.SecondClass.COLOR_PUBLIC_STATIC_FINAL;
//import static den.SecondClass.colorPublicStatic;
//import static den.SecondClass.colorStatic;

public class FirstClass  {

    public static void main(String[] args) {
/*
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
        */

//        System.out.println(colorStatic);
//        System.out.println(colorPublicStatic);
//        System.out.println(COLOR_PUBLIC_STATIC_FINAL);

        SecondClass ob = new SecondClass();
        System.out.println(ob.nameDefault);
        System.out.println(ob.nameProtected);
        System.out.println(ob.namePublic);
        // No private field


    }
}
