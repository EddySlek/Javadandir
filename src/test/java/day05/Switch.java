package day05;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the your city");
        String cityName = scan.nextLine();

        //Switch:
        switch (cityName) {
            case "miami":
                System.out.println("Florida");
                break;
            case "denver":
                System.out.println("COLORADO");
                break;
            case "brooklyn":
                System.out.println("New York");
                break;
            default:
                System.out.println("I don't know where you live but I am sure the " + cityName + " is not in USA" );
        }




    }
}
