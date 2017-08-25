package Test;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import home.HomePage;

public class BaseTest {

    static WebDriver webDriver;
    protected static HomePage homePage;

    @BeforeClass
    public static void before() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/ofalamas/Downloads/chromedriver_win32/chromedriver.exe");

        webDriver = new ChromeDriver();
    }

    @Before
    public void goToPage(){
        webDriver.get("http://192.168.169.133:81/joomla/");
        homePage = PageFactory.initElements(webDriver,HomePage.class);
    }



   @AfterClass
   public static void closeBrowser () {
        webDriver.close();
    }

}
