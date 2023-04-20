package day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pr {

    public static void main(String[] args) {

        List<Integer> listo = new ArrayList<>();

        listo.add(2);
        listo.add(48);
        listo.add(8);
        listo.add(0);
        listo.add(12);
        listo.add(23);

        System.err.println(listo);
        System.out.println(listo.get(0));

        // update list element
        listo.set(0, 35);
//        System.err.println(listo);
//
//
//        for(int i=0; i< listo.size();i++){
//            if(listo.get(i)%2==0){
//                System.out.print("even: " + listo.get(i) + "  ");
//
//            }
//        }

        // stream()
//        listo.forEach(t-> System.out.println("it is forEach: " + t));
        listo.stream().filter(elementOfList -> elementOfList % 2 == 0 ).sorted().forEach(t-> System.err.println(t));

//        // Arrays [] [] [] [] [] [] [] [] [] [] [] [] []
//        int[] selmanList = new int[2];
//        selmanList[0]=12;
//        selmanList[1]=33;
//        System.out.println(Arrays.toString(selmanList));
//        System.out.println(selmanList[0]);


    }

}