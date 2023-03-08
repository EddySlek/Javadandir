package day06;

import java.util.Scanner;

public class LoopLoopLokumlar {

    public static void main(String[] args) {
/*
        //Print "Hello world!" on the console 10 times...

        //1.Way:
//		System.out.println("Hello world!");
//		System.out.println("Hello world!");
//		System.out.println("Hello world!");
//		System.out.println("Hello world!");
//		System.out.println("Hello world!");
//		System.out.println("Hello world!");
//		System.out.println("Hello world!");
//		System.out.println("Hello world!");
//		System.out.println("Hello world!");
//		System.out.println("Hello world!");

        // for loop
        for (int i = 0; i < 10; i += 3) {
            System.out.println(+i);
        }
        System.out.println("\n");

        //Nested loops
        for (int i = 1; i < 4; i++) {

            for (int j = 5; j < 9; j++) {
                System.out.println(i + " - " + j);
            }

        }

        // While loop
        int nbr = 10;
        while (nbr < 20) {
            System.out.println(nbr);
            nbr++;
        }
*/
        // Do while:
        int numberr;
        int attempt = 3;

        do {

            Scanner scan = new Scanner(System.in);
            System.out.println("enter your password");
            numberr = scan.nextInt();
            if (numberr == 1212) {
                System.out.println("Your password is correct!");
            } else {
                System.out.println("wrong password, gfys");
            }
            attempt--;
            System.out.println(attempt);

        } while (numberr != 1212 && attempt != 0); //false olunca donguden cikiyorsun.

        System.out.println("Go Your Home");


        // Attempts=3
//            Scanner scan = new Scanner(System.in);
//            System.out.println("enter your password");
//            int numberX = scan.nextInt();
//
//            for (int i = 1; i<4; i++) {
//                if (numberX == 1212) {
//                    System.out.println("Your password is correct!");
//                    System.out.println("What is your balance!!!!!");
//                    break;
//                } else {
//                    System.out.println("wrong password, gfys");
//                }
//            }


    }

}
