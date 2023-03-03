package day05;

import java.util.Scanner;

public class nestedIf {

    public static void main(String[] args) {


        // ask the user
        Scanner scan = new Scanner(System.in);

//        char ch = 'A';

        System.out.println("enter your age");
        int age = scan.nextInt();

        System.out.println("enter your gender M or F");// male -> MALE -> M     == and !=
        char gender = scan.next().toUpperCase().charAt(0);

        if (age < 0) {

            System.out.println("I think your are still on the way!");

        } else if (!(gender == 'M' || gender == 'F')) {

            System.out.println("What is gender dude");

        } else if (gender == 'M') {

            if (age > 65) {
                System.out.println("You should die. Retired");
            } else {
                System.out.println("You should pay tax!");
            }

        } else if (gender == 'F') {

            if (age > 60) {
                System.out.println("You should be happy after retired");
            } else {
                System.out.println("work more for paying TAX");

            }
        }

        // fix the format-->  ctrl + alt + L
        // fix the import-->  ctrl + alt + O

    }
}
