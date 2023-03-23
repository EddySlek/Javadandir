package day07;

import java.util.ArrayList;
import java.util.List;

public class StringManipulations {
    public static void main(String[] args) {
//
//        // 1- equals() == > Compare the Strings with cases and it returns boolean
//        // 2- equalsIgnorecase() == > Compare the Strings without cases and it returns boolean
//
//        String a = "Machine";
//        String b = "Motor";
//        String c = "machine";
//
//        System.out.println(a.equals(c)); // false
//        System.out.println(a.equalsIgnoreCase(c));// true
//
//        //3- length() == > the counts(size) of chars in a String and it returns
//
//        String s1 = "handkerchief", s2 = "", s3 = " ", s4 = null;
//
//        int count = s1.length();
//
//        System.out.println(s1.length());//12
//        System.out.println(s2.length());//0
//        System.out.println(s3.length());//1
//        // System.out.println(s4.length());//NullPointerException
//
//        /*
//           4- toUpperCase ==> Converts all the Characters to UpperCase and it returns String
//		   5- toLowerCase == > Converts all the Characters to LowerCase and it returns String
//		   6- contains() == > Checks if any specific characters exist or not and it returns boolean.
//       */
//
//        String isIt = "Automation is harder then Manual.";
//        System.out.println(isIt.toLowerCase());//automation is harder then manual.
//        System.out.println(isIt.toUpperCase());//AUTOMATION IS HARDER THEN MANUAL.
//        System.out.println(isIt.contains("ar"));//true
//
//        // 7- charAt() == > used to get a specific character from string an d it returns character.
//
//        String character = "This car is expensive.";
//        System.out.println(character.charAt(10));//s
//        System.out.println(character.charAt(2));//i
//
//       /*
//        8- indexOf()
//        9- lastIndexOf() = length()-1
//        For non-repeated values indexOf() and lastIndex() methods return same value */
//
//        String same = "MMyy gradess are low.";
//
//        System.out.println(same.indexOf("M"));//0
//        System.out.println(same.lastIndexOf("M"));//1
//        System.out.println(same.indexOf("l"));//17
//        System.out.println(same.lastIndexOf("l"));//17
//
//        String example = "Schhoolll ics oopppeeenn.";
//        System.out.println(example.indexOf("c", 3));//11
//
//       /* 11-startsWith()
//        12- endsWith()
//       */
//        String s20 = "Java is easy";
//
//        System.out.println(s20.startsWith("J"));//true
//        System.out.println(s20.startsWith("j"));//false
//
//        System.out.println(s20.startsWith("Java"));//true
//        System.out.println(s20.endsWith("y"));//true
//        System.out.println(s20.toLowerCase().startsWith("j"));//true
//
//        System.out.println("***********************************");
//
//        // 13- isEmpty()
//
//        String s100 = "";
//        String s200 = " ";
//        String s300 = null;
//
//        System.out.println(s100.isEmpty());//true
//        System.out.println(s200.isEmpty());//false
//        // System.out.println(s300.isEmpty());//NullPointerException
//
//        System.out.println("------------------------------------");
//
//      /*  14- replace()
//          15- replaceAll()
//      */
//
//        String lookAt = "One day, everything will be great !";
//
//        System.out.println(lookAt.replace("ad", "*")); //One d*y, everything will be gre*t !
//        System.out.println(lookAt.replaceAll("[ad]", "*"));//One **y, everything will be gre*t !
//
//        // 16- substring()
//
//        String whatCanIdo = "I am going to cook ..";
//        System.out.println(whatCanIdo.substring(5));//going to cook ..
//        System.out.println(whatCanIdo.substring(5, 7));//go
//
//        //17- trim()
//
//        String student = "    The grades are so good!     ";
//        System.out.println(student.trim());
//
//        //18- concat()
//
//        String s110 = "I am so grateful,";
//        String s220 = " because of your support.";
//        System.out.println(s110.concat(s220));
//
//        List<Object> namex = new ArrayList<>();

        int nn = 'A';
        System.out.println(nn);

        int nbr = 10;
        System.out.println(nbr);

        Integer nbr1 = 10;
        System.out.println(nbr1);

        System.out.println(nbr1.equals(10));

        String str = "DENVER COLORADO";
        System.out.println(str);
        System.out.println("it change for printing console: " + str.replace(" ", "").toLowerCase());

        // When println str String, It is nothing change here. String is an immutable for security.
        str.replace(" ", "").toLowerCase();
        System.out.println(str);//

        //Create new String and assign previous String which is "str"
        str = str.replace(" ", "").toLowerCase();
        System.out.println(str);
        // But here, we assign new value for str String


    }

}