package Page;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriver;

public class PageFactory {

        WebDriver driver;
        private LandingPage landingPage;



    public PageFactory(WebDriver driver)
    {
        this.driver = driver;
    }


        public LandingPage getLandingPage()
        {
            if(landingPage == null)
            {
                landingPage = new LandingPage(driver);

            }
            return landingPage;
        }


    }


