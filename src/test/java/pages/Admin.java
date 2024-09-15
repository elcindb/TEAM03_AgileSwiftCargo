package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Admin {


    public Admin(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()='Branch Manage']")
    public WebElement branchManageDashboard;

    @FindBy(xpath = "(//a[text()='Branch'])[2]")
    public WebElement branch;

    @FindBy(xpath = "(//a[@href='https://qa.agileswiftcargo.com/admin/hubs'])[3]")
    public WebElement clearBranch;

    @FindBy(xpath = "//button[@class='btn btn-space btn-primary']")
    public WebElement filterBranch;

    @FindBy(xpath = "(//button[@tabindex='-1'])[1]")
    public WebElement actionsBranch;

    @FindBy(xpath = "//a[@href='https://qa.agileswiftcargo.com/admin/hubs/create']")
    public WebElement plusBranch;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement hubNameTextBranch;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement phoneTextBranch;






}
    public Admin(){ PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy (xpath = "//*[text()='Agile Swift Cargo Dashboard ']")
    public WebElement AdminDashboardPageText;






   }

