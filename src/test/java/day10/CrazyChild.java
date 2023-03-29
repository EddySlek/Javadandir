package day10;

import day09.GrandFather;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CrazyChild extends Mother {


    String child = namePublic2;


    GrandFather nn = new GrandFather();
    String exo = nn.grandFatherPublic;
    String wqw = nn.grandFatherPublic2;

    WebDriver driver = new ChromeDriver();


    public static void main(String[] args) {


        Assert.assertFalse(4>5,"It is wrong. 4 number ever never bigger than 5");


    }


}
