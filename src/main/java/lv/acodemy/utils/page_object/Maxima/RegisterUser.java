package lv.acodemy.utils.page_object.Maxima;

import lv.acodemy.utils.LocalDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegisterUser {

    private WebDriver driver = LocalDriverManager.getInstance();

    public RegisterUser(){PageFactory.initElements(driver,this);}

    @FindBy(how = How.CLASS_NAME,className = "btn-sign-up")
    WebElement singup;
    @FindBy (how = How.ID,id = "oath-email")
    WebElement userEmailField;
    @FindBy (how = How.ID,id = "btn-submit-oath" )
    WebElement clickContinue;
    @FindBy (how = How.ID,id = "input-3" )
    WebElement passwordField;
    @FindBy (how = How.ID,id = "input-4")
    WebElement passwordConfirm;
    @FindBy (how = How.XPATH,xpath = "//mat-checkbox[@id ='mat-checkbox-1']")
    WebElement checkBox;


    public void singUp(String email, String password , String passwordconfirmation){
         singup.click();
        userEmailField.sendKeys(email);
        clickContinue.click();
        passwordField.sendKeys(password);
        passwordConfirm.sendKeys(passwordconfirmation);
        checkBox.submit();
    }


}
