package den;

public class SecondClass {

    // Non-Static fields:
    int colorNbr = 12;
    String colorString = "colorString";
    public String colorPublic = "colorPublic";


    // Static fields(variables) means (Global-> public + static)
    static String colorStatic = "colorStatic";
    protected static String colorStaticProtected = "colorStaticProtected";
    public static String colorPublicStatic = "colorPublicStatic";
    public static final String COLOR_PUBLIC_STATIC_FINAL = "colorPublicStatic";

    void nonStaticMethod(){

    }

    static void staticMethod(){

    }

    // Access Modifiers;
    String nameDefault = "nameDefault";
    protected String nameProtected = "nameProtected";
    public String namePublic = "namePublic";
    private String namePrivate = "namePrivate";



}
