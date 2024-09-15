package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Home {

public Home(){
    PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(className ="logo" )
    public WebElement anasayfaLogo;

    @FindBy(xpath = "//*[text()='Login']")
    public WebElement loginButton;

    @FindBy (id = "email")
    public WebElement loginPageEmailBox;

    @FindBy (id = "password")
    public WebElement loginPagePasswordBox;

    @FindBy (xpath = "//*[text()='Sign in']")
    public WebElement loginPageSignIn;

}
