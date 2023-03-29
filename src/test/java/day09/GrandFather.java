package day09;

public class GrandFather {

    // Less Secure
    public String grandFatherPublic = "public";
    protected String grandFatherProtected = "Protected";

    // More secure
    String grandFatherDefault = "baba"; // default access modifier
    private String grandFatherPrivate = "private";


    // Less Secure
    public static String grandFatherPublic2 = "public";
    protected static String grandFatherProtected2 = "Protected";

    // More secure
    static String grandFatherDefault2 = "baba"; // default access modifier
    private static String grandFatherPrivate2 = "private";



}
