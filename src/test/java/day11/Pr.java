package day11;

import java.util.Scanner;

public class Pr {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.err.println("Positive number typing, dude!");
        int number = scan.nextInt();

        // 1: positive,
        // 2: number have to divide by "1"
        // 3: number have to divide by "itself"

        if (number > 0) {

            if (number == 1) {

                System.out.println("It is a prime number - Number is 1");

            } else {

                for (int i=2; i<number; i++){

                    if(number % i == 0){
                        System.out.println("NOT prime number");
                        break;
                    }
                    System.out.println("Prime number");
                }


            }

        } else {

            System.out.println("Please enter po number");

        }







    }


}
