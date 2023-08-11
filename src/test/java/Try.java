public class Try {

    public static void main(String[] args) {

        /**

         1- If condition
         2- Loop
         * for loop
         * do, while loop
         3- Array
         4- Manipulate the String
         5- List

         */

        System.out.println("Hello World");

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }


        // interview Question: Write a Java Program to reverse a string
        String str = "DARIA";
        System.out.println(revStr(str));

        //1.Way: By using StringBuilder()
        StringBuilder strB = new StringBuilder();
        strB.append(str);
        System.out.println(strB.reverse());

        String revStr = "";
        //2.Way: By using String Class
        for(int i=str.length()-1; i>=0; i--) {
            revStr = revStr + str.charAt(i);
        }
        System.out.println(revStr);

    }

    public static String revStr(String str) {
        String revStr = "";
        for(int i=str.length()-1; i>=0; i--) {
            revStr = revStr + str.charAt(i);
        }
        return revStr;
    }




}