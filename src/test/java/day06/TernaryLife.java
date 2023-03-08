package day06;

import java.util.Scanner;

public class TernaryLife {

    static int stepCount;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please tell me about your daily steps:  ");
        stepCount = scan.nextInt();

       /* if (stepCount > 10000) {
            System.out.println("Running good!");
        } else {
            System.out.println("You should more!!");
        }
        */

// Ternary : Variable = condition ? expressionTrue : expressionFalse;


        String msg = stepCount > 10000 ? "Running good!" : "You should more!!";
        System.out.println(msg);

        int number = 10 == 10 ? 10 : 20;

        String a = "Mardin".equals("Hakkari") ? "Yasa" : "Ayip sana";

        boolean b = 20 > 10 ? true : false;

        boolean oo = stepCount > 100 ? true : false;

        int nnn = 10 == 10 ? 10 : 13;


    }
}
