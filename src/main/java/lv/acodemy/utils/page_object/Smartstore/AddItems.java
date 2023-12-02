package lv.acodemy.utils.page_object.Smartstore;

import lv.acodemy.utils.LocalDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddItems {
    private WebDriver driver = LocalDriverManager.getInstance();

    public AddItems(){PageFactory.initElements(driver,this);}


    @FindBy (how = How.XPATH,xpath = "//div[@class='grid-items__4 vnd-ist-termovela-viriesiem']")
    WebElement item;
    @FindBy (how = How.NAME,name = "add")
    WebElement addItem ;
    @FindBy (how = How.XPATH,xpath = "//a[@href='/']")
    WebElement sakums;
    @FindBy(how = How.XPATH,xpath = "//a[@href='/collections/termovela-viriesiem/products/stark-soul-termo-bikses-viriesiem']")
    WebElement addItem2;
    @FindBy(how = How.XPATH,xpath = "//div[@class='increase text-center']")
    WebElement Itemquantity;
    @FindBy (how = How.NAME,name = "add")
    WebElement item2 ;
    @FindBy (how = How.XPATH,xpath = "//a[@class='icon-cart cart-amount__right']")
    WebElement grozs;
    @FindBy (how = How.NAME,name = "checkout")
    WebElement pasutit;


    public void atoriz() {
        item.click();
        addItem.click();
        sakums.click();
        addItem2.click();
        Itemquantity.click();
        Itemquantity.click();
        Itemquantity.click();
        Itemquantity.click();
        Itemquantity.click();
        item2.click();
        // Wait for 5 seconds before interacting with item2
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(item2)).click();
        // Wait for 5 seconds before interacting with grozs
        wait.until(ExpectedConditions.elementToBeClickable(grozs)).click();
        pasutit.click();
    }
}
