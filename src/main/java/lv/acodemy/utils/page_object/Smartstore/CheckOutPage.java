package lv.acodemy.utils.page_object.Smartstore;

import com.github.javafaker.Faker;
import lv.acodemy.utils.LocalDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class CheckOutPage {

    Faker fakedata = new Faker();
    private WebDriver driver = LocalDriverManager.getInstance();

    public CheckOutPage(){PageFactory.initElements(driver,this);}


    @FindBy (how = How.ID,id = "email")
    WebElement emailField;
    @FindBy (how = How.NAME,name = "marketing_opt_in")
    WebElement checkBox;

    @FindBy(how = How.ID,id = "Select0")
    WebElement countrySelector;
    @FindBy(how = How.XPATH,xpath = "//option[@value='AL']")
    WebElement countryName ;
    @FindBy(how = How.NAME,name = "firstName")
    WebElement nameInput;

    @FindBy(how = How.NAME,name = "lastName")
    WebElement lastNameInput;

    @FindBy(how = How.NAME,name = "address1")
    WebElement deliveryAddress;

    @FindBy(how = How.NAME,name = "city")
    WebElement cityInput;
    @FindBy(how = How.NAME,name = "postalCode")
    WebElement postCode;
    @FindBy(how = How.NAME,name = "phone")
    WebElement phoneNr;
    @FindBy(how = How.NAME,name = "save_shipping_information")
    WebElement checkBox2;
    @FindBy(how = How.ID,id = "pay-button-container")
    WebElement apmaksatTagad;



    public void checkOut()  {
        emailField.sendKeys(fakedata.internet().emailAddress());
        checkBox.click();
        countrySelector.click();
        countryName.click();
        countrySelector.click();
        nameInput.sendKeys(fakedata.name().firstName());
        lastNameInput.sendKeys(fakedata.name().lastName());
        deliveryAddress.sendKeys(fakedata.address().streetName());
        cityInput.sendKeys(fakedata.address().city());
        postCode.sendKeys(fakedata.number().digits(4));
        phoneNr.sendKeys("+355 2", fakedata.number().digits(7));
        checkBox2.click();
        apmaksatTagad.click();


    }
}
