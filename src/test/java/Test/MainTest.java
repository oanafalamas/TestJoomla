package Test;

import home.HomePageAfterLog;
import org.junit.Assert;
import org.junit.Test;
import home.HomePage;
import userMenuPages.SiteAdministrator;
import userMenuPages.SubmitArticle;
import userMenuPages.YourProfile;

public class MainTest extends BaseTest {

    @Test
    public void test() throws InterruptedException {

        HomePageAfterLog homePageAfterLog = homePage.LoginWithParam("ofalamas", "wanna");
        homePageAfterLog.searchMet("Getting Started ");
        homePageAfterLog.gettingStartedMet();
      //  homePageAfterLog.HoverOverEditPhoto();

        YourProfile yourProfile = homePageAfterLog.yourProfileMet();
        yourProfile.nameMet("Roxana");
        yourProfile.emailMet("roxana@yahoo.com");
        yourProfile.confirmEmailMet("roxana@yahoo.com");
        yourProfile.submitMet();

        SubmitArticle submitArticle = yourProfile.submitArticleMet();
        submitArticle.titleMet("Java Wikipedia");
        submitArticle.boldMet();
        submitArticle.newArticle("Java is a general-purpose computer programming language that is concurrent, class-based, object-oriented,[14] and specifically designed to have as few implementation dependencies as possible. It is intended to let application developers \"write once, run anywhere\" (WORA),[15] meaning that compiled Java code can run on all platforms that support Java without the need for recompilation.[16] Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of computer architecture. As of 2016, Java is one of the most popular programming languages in use,[17][18][19][20] particularly for client-server web applications, with a reported 9 million developers.[21] Java was originally developed by James Gosling at Sun Microsystems (which has since been acquired by Oracle Corporation) and released in 1995 as a core component of Sun Microsystems' Java platform. The language derives much of its syntax from C and C++, but it has fewer low-level facilities than either of them.");

        SiteAdministrator siteAdministrator = submitArticle.siteAdministratorMet();
        siteAdministrator.usernameMet("ofalamas");
        siteAdministrator.passwordMet("wanna");
        siteAdministrator.Language("Romanian");
        siteAdministrator.romanianMet();
        siteAdministrator.loginMet();
        siteAdministrator.contentAdminMet();
        siteAdministrator.mediaMet();
        siteAdministrator.animalsMet();
        siteAdministrator.photoMet();
        siteAdministrator.closePhotoMet();




    }

}
