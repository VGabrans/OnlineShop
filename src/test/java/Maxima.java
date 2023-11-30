import lombok.extern.slf4j.Slf4j;
import lv.acodemy.utils.ConfigurationProperties;
import lv.acodemy.utils.LocalDriverManager;
import lv.acodemy.utils.page_object.Maxima.CookiesAccept;
import lv.acodemy.utils.page_object.Maxima.LogInPage;
import lv.acodemy.utils.page_object.Maxima.Notifications;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;
@Slf4j
public class Maxima {


    WebDriver driver = LocalDriverManager.getInstance();
    LogInPage logInPage = new LogInPage();
    CookiesAccept cookiesAccept = new CookiesAccept();


    Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    @Test  (description = "Check That Not Registered User Cant open User Page ")

    public void TestBeatStars(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(ConfigurationProperties.getConfiguration().getString("beat.url"));
        cookiesAccept.acceptCookies();
        logInPage.open("","");

//        System.out.println();

    }
    @AfterMethod
    public void after(){


        LocalDriverManager.closeDriver();

    }


}
