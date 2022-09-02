package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LandingPage {


    WebDriver driver;

    By Women = By.xpath("//div[@class='navigation-primary__section']");

    By Lingrie = By.xpath("//div[@class='nav-primary__menu-link icon--hdr-arrow-right']");
    By Men = By.xpath("nav-primary__menu-link icon--hdr-arrow-right");





    public LandingPage(WebDriver driver) {
        this.driver = driver;

    }
}



