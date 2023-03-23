package day08;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ArrayMan {

    // Access Modifier :)
    public static String name1 = "Gariban";
    private String name2 = "GaribanOlc";
    protected String name3 = "Gariban";
              String name4 = "Gari"; // this field is already default access modifier. You don't need to write it!


    // Overloading Method:
    int totalTax(){
        return 10000;
    }

    int totalTax(int income){
        return 10 + income;
    }

    int emrah(int income, int expense){
        return 10 + income - expense;
    }



    public static void main(String[] args) {

    /*
        ARRAY:
        1) Arrays are used to store multiple data in a single container.
	 	2) In an array all elements must be in same data type.
	 	3) You can't change the array length if you create previous array
    */

        String n1 = "inland";
        String n2 = "JBL";

        String[] nList = new String[4]; // length is 2
        String foodList[] = new String[3];
        int[] nbr = new int[6];

        nList[0] = "denver";
        nList[1] = "colorado";

        nbr[0]=10;
        nbr[1]=1;
        nbr[2]=121;
        nbr[3]=545;

        System.out.println(nList[0]);
        System.out.println(Arrays.toString(nList));
        System.out.println(Arrays.toString(nbr));

        // ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
        // System.out.println(nbr[5]);

        // 2.way to creat Array:
        String[] newList = {"colorado spring", "loveland Skii Resort", "Selman sevmiyo Snowboar"};
        int[] nbr2 = {12,23,45,90,667};

        System.out.println(newList[1]);
        System.out.println(Arrays.toString(newList));

        // split method: We create an Array with String
        String nba = "Nugget,Nets,Heat,Lakers";

        String[] nbaList = nba.split(",");

        System.out.println(Arrays.toString(nbaList));
        System.out.println("It is winner team: " + nbaList[0] + " ---- " + "It is loser team: " +nbaList[3]);
        System.out.println(nbaList.length);
        System.out.println(nba.length());

        for(int i=0; i<nbaList.length; i++){
            System.out.println("forLoop: " + nbaList[i]);
        }

        System.out.println("\n");

        for(String forEachElement : nbaList){
            System.out.println("foreach: " + forEachElement);
        }

        int[] salary = {100000,200000, 0};

        for(int checkEachPersonSalary : salary){
            System.out.println("forEachSalary: " + checkEachPersonSalary);
        }

        // MultiDimensionArray:
        int[][] nbrr = {{12,2},{44,56}};
        System.out.println(nbrr[0][0]);
        System.out.println(nbrr[0][1]);
        System.out.println(nbrr[1][0]);



    }




}
