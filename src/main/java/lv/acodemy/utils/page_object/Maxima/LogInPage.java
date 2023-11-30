package lv.acodemy.utils.page_object.Maxima;

import lv.acodemy.utils.LocalDriverManager;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

   private WebDriver driver = LocalDriverManager.getInstance();

    public LogInPage(){PageFactory.initElements(driver,this);}

    @FindBy (how = How.XPATH,xpath = "//a[@href='/paldies/paldies-konts']")
    WebElement clickPaldies;

    @FindBy(how = How.ID,id = "MALoginForm_loginInput")
    WebElement emailField;
    @FindBy(how = How.ID,id = "MALoginForm_password")
    WebElement passwordField;
    @FindBy(how = How.ID,id = "submitLoginPaldies")
    WebElement pieslegties;



    public void open(String Email , String Password){
        clickPaldies.click();
        emailField.sendKeys(Email);
        passwordField.sendKeys(Password);
        pieslegties.click();

    }
}
