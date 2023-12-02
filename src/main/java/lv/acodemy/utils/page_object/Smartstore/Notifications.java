package lv.acodemy.utils.page_object.Smartstore;

import lv.acodemy.utils.LocalDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElement;

public class Notifications {


    WebDriver driver = LocalDriverManager.getInstance();
    WebDriverWait waiter ;

    public Notifications(WebDriverWait wait){
        this.waiter = wait;
    }

    //Empty Card Number Field //
    private final By emptyCardNumberField = By.id("error-for-number");
    public WebElement getEmptyCardNumberLocator(){
        return driver.findElement(emptyCardNumberField);
    }
    public String getEmptyCardNumberMessage(){
        waiter.until(ExpectedConditions.textToBePresentInElement(getEmptyCardNumberLocator(),"Enter a card number"));
        return getEmptyCardNumberLocator().getText();
    }
    //Empty Card Expiration Date
    private final By emptyCardExpirationDate = By.id("error-for-expiry");
    public WebElement getCardExpirationDateLocator(){
        return driver.findElement(emptyCardExpirationDate);
    }
    public String getCardExpirationDateMessage(){
        waiter.until(ExpectedConditions.textToBePresentInElement(getCardExpirationDateLocator(),"Enter a valid expiration date"));
        return getCardExpirationDateLocator().getText();
    }

    //Empty Card CCV code //
    private final By emptyCardCcvCode = By.id("error-for-verification_value");
    public WebElement getCardCcvCodeLocator(){
        return driver.findElement(emptyCardCcvCode);
    }
    public String getCardCcvCodeMessage(){
        waiter.until(ExpectedConditions.textToBePresentInElement(getCardCcvCodeLocator(),"Enter the CVV or security code on your card"));
        return getCardCcvCodeLocator().getText();
    }



}
