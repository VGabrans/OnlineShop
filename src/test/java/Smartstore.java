import lombok.extern.slf4j.Slf4j;
import lv.acodemy.utils.ConfigurationProperties;
import lv.acodemy.utils.LocalDriverManager;
import lv.acodemy.utils.page_object.Smartstore.AddItems;
import lv.acodemy.utils.page_object.Smartstore.CheckOutPage;
import lv.acodemy.utils.page_object.Smartstore.CookiesAccept;
import lv.acodemy.utils.page_object.Smartstore.Notifications;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.time.Duration.of;
import static java.time.Duration.ofSeconds;
import static org.assertj.core.api.Assertions.assertThat;
@Slf4j
public class Smartstore {


    WebDriver driver = LocalDriverManager.getInstance();
    WebDriverWait wait2 = new WebDriverWait(LocalDriverManager.getInstance(),ofSeconds(ConfigurationProperties.getConfiguration().getLong("wait.time")));
    CookiesAccept cookiesAccept = new CookiesAccept();
    AddItems addItems = new AddItems();
    CheckOutPage checkOutPage = new CheckOutPage();
    Notifications notifications = new Notifications(wait2);
    Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @Test  (description = "Check That Not Registered User Cant open User Page ")

    public void TestBeatStars(){
        driver.get(ConfigurationProperties.getConfiguration().getString("beat.url"));
        cookiesAccept.acceptCookies();
        addItems.atoriz();
        checkOutPage.checkOut();
        //ERROR Message //Empty Card Fields//
        assertThat(notifications.getEmptyCardNumberMessage()).isEqualTo("Enter a card number");
        assertThat(notifications.getCardExpirationDateMessage()).isEqualTo("Enter a valid expiration date");
        assertThat(notifications.getCardCcvCodeMessage()).isEqualTo("Enter the CVV or security code on your card");



    }
    @AfterMethod
    public void after(){


        LocalDriverManager.closeDriver();

    }


}
