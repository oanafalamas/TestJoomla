package userMenuPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SubmitArticle {

    public WebDriver webDriver;

    public SubmitArticle(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @FindBy(id = "jform_title")
    private WebElement title;

    @FindBy(xpath = ".//div[@id='mceu_0']")
    private WebElement bold;

    @FindBy(css = "iframe#jform_articletext_ifr")
    private WebElement articleFrame;

    @FindBy(xpath = ".//div[@id='mceu_1']")
    private WebElement italic;

    @FindBy(xpath = ".//button[@class='btn btn-primary']")
    private WebElement saveArticle;

    @FindBy(xpath =".//div[@id='aside']//ul[@class='nav menu']/li/a")
    private List<WebElement> menuList;

    @FindBy(xpath=".//li[@class='item-103']/a")
    private WebElement siteAdministrator;


    public void titleMet(String param) {
        title.sendKeys(param);
    }

    public void boldMet() {
        bold.click();
    }

    public void newArticle(String content) {
        webDriver.switchTo().frame(articleFrame);
        webDriver.findElement(By.id("tinymce")).sendKeys(content);
        webDriver.switchTo().defaultContent();
        saveArticle.click();
    }

    public SiteAdministrator siteAdministratorMet() {
        menuList.get(1).click();
        SiteAdministrator site = PageFactory.initElements(webDriver, SiteAdministrator.class);
        return site;
    }
}