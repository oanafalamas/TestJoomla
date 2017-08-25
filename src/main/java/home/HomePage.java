package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage {

    @FindBy(id = "modlgn-username")
    private WebElement username;

    @FindBy(id = "modlgn-passwd")
    private WebElement password;

    @FindBy(xpath = ".//button[@class='btn btn-primary login-button']")
    private WebElement loginButton;

    private WebDriver webDriver;

    public HomePage(WebDriver driver) {
        this.webDriver = driver;
    }

    public HomePageAfterLog LoginWithParam(String loginName, String loginPassword) {
        username.sendKeys(loginName);
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(password));
        password.sendKeys(loginPassword);
        loginButton.click();

        HomePageAfterLog homePageAfterLog = PageFactory.initElements(webDriver, HomePageAfterLog.class);
        return homePageAfterLog;
    }
}