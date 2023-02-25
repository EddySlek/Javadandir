package day02;

public class Fields_Methods_DataType {

    /*
        1) Field / Variable=>
             int A = 115;
                int: field data type
                  A: field name
                115: field value

        2) Method / Function=>

              void number(){ }

        NOTE:
        * package name start with lowercase
        * class is starting with uppercase
        * we use camel method for name => selmanMudurMardinNYC

     */


    // DataType: Primitive DataTypes and Non-Primitive/Reference

    // A) We have 8 primitive data types:

    // Character:
    char ch1 = 'a';
    char ch2 = '3';
    char ch3 = '%'; //semi-column

    // True and false:
    boolean bl1 = true;
    boolean bl2 = false;

    // Whole number:   byte < short < int < long
    byte by = 12;
    short sh = 1121;
    int in = 12131313; //********
    long lg = 123124832;

    // Decimal Number: float < double
    float fl = 15.23f;
    double dl = 154.415245; //*******

    // Common primitive data type: char, boolean, int, double


    // B) Non-Primitive: String
    String nameCity = "Denver";
    static String name1 = "312313////97898-----***3454634646^%&%^&*&(&*()&*((&tqweqwre&&*%*&&*&(%$&^%&";
    String name2 = "15";
    String name3 = "$$$$$$$%%%%%^^^&*()_#%!@#";

    String nm1 = "Emrah", nm2 = "Tugce", nm3 = "Selman";
    int n1 = 5, n2 = 4;


    // METHOD / FUNCTION:
    public static void main(String[] args) {
        mt1();
        System.out.println(mt2());
        System.out.println(mt3());
        System.out.println(mt4());

        String nameSam1 = "selman";
        mt5(nameSam1);
        mt5(name1);
        // System.err.println(mt5(nameSam1));

    }

    static String mt5(String nameSam) {
        return nameSam;
    }

    // public: Access modifier
    // static: key, heryerde kullanabilmek iicin ve hafizada cok yer kaplamamk icin kullanilir
    // ** void: method return type (dataType)
    // ** main: method name
    // ** () : parameters
    // ** {} : method function or method body

    static void mt1() {
        System.out.println("mt1");
        System.out.println("mt1");
        System.out.println("mt1");
        System.out.println("mt1");
    }

    static String mt2() {
        return "mt2-Name";
    }

    static int mt3() {
        return 3;
    }

    static boolean mt4() {
        return true;
    }

    char ch10() {
        return 'a';
    }


}
