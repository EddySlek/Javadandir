package day11;

import java.util.Scanner;

public class Pr2 {

    public static void main(String[] arg){

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a positive number");
        int nbr = scan.nextInt();//4578

        String number = Integer.toString(nbr);

        // Convert
        double d =12.2;
        String nn = Double.toString(d);
        long l = Long.parseLong(nn);

        // int to String

        int resul=0;
        for(int i=0; i<number.length();i++){
            int n = Integer.parseInt(String.valueOf(number.charAt(i)));
            // String to int
            int s = (int) Math.pow(n,3);
            resul = resul+s;

        }

        if(nbr==resul){
            System.err.println("OMG. It is amrstrong");
            return;
        }
        System.out.println("No way");



    }
}
