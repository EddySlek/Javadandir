package day11;

import java.util.Arrays;
import java.util.Scanner;

public class Pr {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter array size");
        int nbr = scan.nextInt();
        int[] arrayy = new int[nbr];

        System.out.println("enter arrays elements");
        for(int i=0; i<nbr; i++){
            int element=scan.nextInt();
            arrayy[i]=element;
        }
        System.out.println(Arrays.toString(arrayy));


    }

}