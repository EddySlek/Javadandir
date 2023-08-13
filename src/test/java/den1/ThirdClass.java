package den1;

import den.SecondClass;

import static den.SecondClass.colorPublicStatic;

public class ThirdClass extends SecondClass {

    public static void main(String[] args) {

        System.out.println(colorPublicStatic);

        SecondClass ob = new SecondClass();
        System.out.println(ob.namePublic);

        ThirdClass ob1 = new ThirdClass();
        System.out.println(ob1.nameProtected);
        System.out.println(ob1.namePublic);



    }

}
