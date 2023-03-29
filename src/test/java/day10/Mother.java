package day10;

import day09.GrandFather;

public class Mother extends GrandFather {

    // Less Secure
    public String namePublic = "public";
    protected String nameProtected = "Protected";

    // More secure
    String nameDafult = "baba"; // default access modifier
    private String namePrivate = "private";


    // Less Secure
    public static String namePublic2 = "public";
    protected static String nameProtected2 = "Protected";

    // More secure
    static String nameDafult2 = "baba"; // default access modifier
    private static String namePrivate2 = "private";





}