package userMenuPages;

import home.HomePageAfterLog;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import userMenuPages.SubmitArticle;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class YourProfile {

    public WebDriver webDriver;

    public YourProfile(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    @FindBy(id="jform_name")
    private WebElement name ;

    @FindBy(id="jform_email1")
    private WebElement email;

    @FindBy(id="jform_email2")
    private WebElement confirmEmail;

    @FindBy(xpath=".//button[@class='btn btn-primary validate']")
    private WebElement submit;


    @FindBy(xpath =".//div[@id='aside']//ul[@class='nav menu']/li/a")
    private List<WebElement> menuList;

    @FindBy(xpath=".//li[@class='item-108']/a")
    private WebElement submitArticle;


    public void nameMet(String param)
    {
        name.clear();
        name.sendKeys(param);
    }

    public void emailMet(String param){
        email.clear();
        email.sendKeys(param);
    }

    public void confirmEmailMet(String param){
        confirmEmail.clear();
        confirmEmail.sendKeys(param);
    }

    public void submitMet(){
        submit.click();
    }

    public SubmitArticle submitArticleMet() {
        menuList.get(4).click();
        SubmitArticle submit = PageFactory.initElements(webDriver, SubmitArticle.class);
        return submit;
    }

}
