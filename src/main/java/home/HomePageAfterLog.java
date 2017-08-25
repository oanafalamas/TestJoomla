package home;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import userMenuPages.YourProfile;

import java.util.List;

public class HomePageAfterLog {

    private WebDriver webDriver;

    @FindBy(id="mod-search-searchword93")
    private WebElement search;

    @FindBy(xpath=".//dl[@class='search-results']//dt/a")
    private WebElement gettingStarted;

    @FindBy(xpath=".//div[@class='custom']")
    private WebElement editPhoto;

   // @FindBy(xpath=".//body[@class='site com_users view-profile layout-edit no-task itemid-102']//footer[@class='footer']")
  //  private WebElement button;

    @FindBy(xpath =".//div[@id='aside']//ul[@class='nav menu']/li/a")
    private List<WebElement> menuList;

    @FindBy(xpath=".//li[@class='item-102']/a")
    private WebElement yourProfile;

    public void searchMet(String param) {
        search.sendKeys(param);
        search.sendKeys(Keys.ENTER);
    }

    public void gettingStartedMet() {
        gettingStarted.click();
    }

    public HomePageAfterLog(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

   /* public void HoverOverEditPhoto() {
        Actions builder = new Actions(webDriver);
        builder.moveToElement(editPhoto).build().perform();

        WebDriverWait wait = new WebDriverWait(webDriver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(button));

        button.click();
    }*/


    public YourProfile yourProfileMet() {
        menuList.get(0).click();
        YourProfile profile = PageFactory.initElements(webDriver, YourProfile.class);
        return profile;
    }
}