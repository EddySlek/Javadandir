package day04;

public class Operators {
    /*
          +
          -
          *
          /

          % -> Module (Remain-Kalan)
     */

    public static void main(String[] args) {

        int nbr1 = 10;
        int nbr2 = 20;
        int nbr3 = nbr1 + nbr2;
        int nbr4 = nbr1 * nbr2; // mutable
        String name = "AvaZe"; // immutable

        System.out.println(nbr1 + nbr2);
        System.out.println(nbr3);
        System.out.println(nbr4);
        System.out.println(name + nbr1 + nbr2);
        System.out.println(name + (nbr1 + nbr2));
        System.out.println(name + " " + "\n" + (nbr1 + nbr2) + "\n");

        // 1.way: incremental and decremental
        nbr1 = nbr1 + 50;
        System.err.println("nbr1: " + nbr1);
        nbr2 = nbr2 - 5;
        System.err.println("nbr2: " + nbr2);

        // 2.way: incremental and decremental
        nbr1 += 100;
        System.err.println("nbr1: " + nbr1);
        nbr2 -= 5;
        System.err.println("nbr2: " + nbr2);

        // 3.way: incremental and decremental (Single dijit by 1)
        nbr1++;
        System.err.println("nbr1: " + nbr1);
        nbr2--;
        System.err.println("nbr2: " + nbr2);

        //Modulus: It is used to find the remainder
        System.out.println(20%5);
        System.out.println(20%3);


        System.out.println("last nbr1: " + nbr1);
        int newNbr = nbr1 / 10;
        double newNbr2 = nbr1 /10;
        System.out.println(newNbr);
        System.out.println(newNbr2);

        /*
            "="   :Assignment operator: It takes the value on the right and puts it into the container on the left

            "=="  :Means equal, returns boolean

            "!="  :Means not equal, returns boolean

            ">", ">=", "<", "<="  :All returns boolean

            "&&"    :And operator. If you have at least a false the result will be false
            "||"    :Or operator. If you have a single true the result will be true
	   */

        int a = 12;

        System.out.println(5 == 2 + 3);//true
        System.out.println(5 == 2 * 3);//false

        System.out.println(5 != 3*4);//true
        System.out.println(5 != 2+3);//false

        System.out.println(5 >= 2+3);//true

        boolean b1 = 5>2;//true
//        boolean b1 = true;
        boolean b2 = 5==2+3;
        boolean b3 = 5==2;// true
        boolean b4 = 5<2; // false

        //To get true from &&, everything must be true. && is perfectionist.
        System.out.println(b1 && b2);//true
        System.out.println(b1 && b2 && b3);//false
        System.out.println(b4 && b3);//false

        //To get false from ||, everything must be false
        System.out.println(b1 || b2 || b3);//true
        System.out.println(b4 || b2 || b3 || b3 || b4);//true







    }

}
