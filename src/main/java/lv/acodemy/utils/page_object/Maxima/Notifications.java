package lv.acodemy.utils.page_object.Maxima;

import lv.acodemy.utils.LocalDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElement;

public class Notifications {

    private WebDriver driver = LocalDriverManager.getInstance();
    WebDriver waiter;

    public Notifications() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, id = "form_common_error")
    WebDriver errorNotification;

    public WebElement getErrorNotification() {
        return driver.findElement((By) errorNotification);
    }

}
