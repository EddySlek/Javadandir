package day10;

public class Mudur extends ArrayListDude {

    // "Constructor":
    // It is a special method to initialize the OBJECT   ->   Mudur objectId = new Mudur();

    // Each class has a default constructor (NO parameters), and you don't need to write it. But If you want you can type it!  ->  Mudur(){}

    Mudur() {
        //default constructor
    }

    Mudur(String str) {
        // Parameter constructor
        // We create it. It is specific to call another object
        String l = "inlandOf";

    }

    Mudur(String city, int nbr) {
        // Parameter constructor
        // We create it. It is specific to call another object
        this.city = city;
        this.nbr = nbr;

    }

    int nbr = 10;


    String city = "denver";
    String state = "CO";


}
