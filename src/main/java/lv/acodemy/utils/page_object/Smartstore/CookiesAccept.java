package lv.acodemy.utils.page_object.Smartstore;

import lv.acodemy.utils.LocalDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CookiesAccept {
    private WebDriver driver = LocalDriverManager.getInstance();
    public CookiesAccept(){PageFactory.initElements(driver,this);}

    @FindBy(how = How.XPATH,xpath= "//button[@class = 'btn btn-third btn-cookie-close']")
    WebElement cookieAccept;

    public void acceptCookies (){
        cookieAccept.click();

    }
}
