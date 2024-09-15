package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Merchant {
    public Merchant(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='https://qa.agileswiftcargo.com/login']")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailTexteBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTexteBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "(//img[@class='user-avatar-md rounded-circle'])[6]")
    public WebElement  profileIconInTheTopBar;

    @FindBy(xpath = "(//a[text()='Profile'])[1]")
    public WebElement  profileLink;

    @FindBy(xpath = "//label[@for='name']")
    public WebElement  nameTexteProfile;

    @FindBy(xpath = "//label[@for='email']")
    public WebElement  emailTexteProfile;

    @FindBy(xpath = "//label[@for='mobile']")
    public WebElement  mobileTexteProfile;

    @FindBy(xpath = "//label[@for='business_name']")
    public WebElement  businessNameTexteProfile;

    @FindBy(xpath = "//label[text()='Address']")
    public WebElement  addressTexteProfile;

    @FindBy(xpath = "//label[@for='image_id']")
    public WebElement  imageProfile;

    @FindBy(xpath = "//label[@for='nid']")
    public WebElement  nidProfile;

    @FindBy(xpath = "//label[@for='trade_license']")
    public WebElement  tradeLicenceProfile;

    @FindBy(xpath = "(//*[text()='Dashboard'])[1]")

    public WebElement dashboardButton;







}
