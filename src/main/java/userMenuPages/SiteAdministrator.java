package userMenuPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class SiteAdministrator {

    public WebDriver webDriver;

    public SiteAdministrator(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @FindBy(id="mod-login-username")
    private WebElement username;

    @FindBy(id="mod-login-password")
    private WebElement password;


    @FindBy(xpath=".//*[@id='lang_chzn']/a")
    private WebElement languageDrop;

    @FindBy(xpath=".//*[@id='lang_chzn']")
    private WebElement languageDropdownElements;

    @FindBy(xpath=".//*[@id='lang_chzn']/div/ul/li")
    private List<WebElement>editorList;

    @FindBy(xpath=".//*[@id='lang_chzn']/div/ul/li[7]")
    private WebElement romanian;

    @FindBy(xpath=".//*[@id='form-login']/fieldset/div[4]/div/div/button")
    private WebElement login;

    //@FindBy(xpath =".//div[@class='j-links-groups']//ul[@class='j-links-group nav nav-list']/li[4]/a")
   // private List<WebElement> menuListAdmin;

    @FindBy(xpath=".//*[@id='menu']/li[4]/a")
    private WebElement contentAdmin;


    @FindBy(xpath=".//*[@id='menu']/li[4]/ul/li[8]/a")
    private WebElement media;

    @FindBy(xpath=".//*[@id='sampledata-parks-animals']/a")
    private WebElement animals;


    @FindBy(xpath=".//*[@id='mediamanager-form']/ul/li[6]/div[2]/label/img")
    private WebElement photo;


    @FindBy(xpath=".//*[@id='imagePreview']/div[1]/button")
    private WebElement closePhoto;


    public void usernameMet(String param){
        username.clear();
        username.sendKeys(param);
    }

    public void passwordMet(String param){
       password.clear();
        password.sendKeys(param);
    }

    public void Language(String languageOption) {
        languageDrop.click();
        if (languageDropdownElements.isDisplayed()) {
            for (int i = 0; i < editorList.size(); i++) {
                if (editorList.get(i).getText().equals(languageOption)) {
                    editorList.get(i).click();
                }
            }
        }
    }

    public void romanianMet()
    {
        romanian.click();
    }

    public void loginMet()
    {
        login.click();
    }

    public void contentAdminMet()
    {
        contentAdmin.click();
    }

    public void mediaMet()
    {
        media.click();
    }

    public void animalsMet()
    {
       animals.click();
    }

    public void photoMet()
    {
       photo.click();
    }

    public void closePhotoMet()
    {
        closePhoto.click();
    }



}
