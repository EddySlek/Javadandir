package day04;

import java.util.Scanner;

public class ScannerDay  {

    public static void main(String[] args){

        /*******************
         Scanner class: to get data from user

         * First we need to create a OBJECT from Scanner class:

         Scanner    scan          =     new      Scanner(System.in)     ;
         ClassName  ObjectName   "="    "nem"    ClassName(Constructor) ;

         ********************/

        Scanner scan = new Scanner(System.in);

        System.out.println("Could you enter the your name, Please");
        String inputUser = scan.nextLine();
        System.err.println("Your name is " + inputUser);

        System.out.println("pleas type uor SSN");
        int ssnNBR = scan.nextInt();
        System.err.println("Your SSN = " + ssnNBR);


        // Primitive Data Type do not manipulated.
        int nbr = 12;

        // Reference/Object data type can be manipulated.
        String name = "DENVER Nugget";
        System.out.println(name);
        System.out.println(name.toLowerCase());

        // String is immutable! for security purpose.
        String city = "NEW YORK";
        city.toLowerCase(); // "new york"
        System.out.println(city);// "NEW YORK"
        System.out.println(city.toLowerCase());// "new york"











    }




}
