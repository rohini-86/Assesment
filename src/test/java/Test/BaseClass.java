package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;



public class BaseClass {
    static WebDriver driver;
    protected static PageFactory pageFactory;

    public static void setup()
    {
         driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.get("https://www.marksandspencer.com/");
        pageFactory  = new PageFactory(driver);
    }
    public void close()
    {
        driver.close();
    }
}
