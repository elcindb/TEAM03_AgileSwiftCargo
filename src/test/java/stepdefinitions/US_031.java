package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import pages.Admin;
import pages.Home;
import utilities.ConfigReader;
import utilities.Driver;

public class US_031 {
    Admin admin = new Admin();
    Home home = new Home();
    @Given("kullanici {string} anasayfaya gider")
    public void kullanici_anasayfaya_gider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }
    @When("sayfada AgileSwift Cargo logosunu dogrular")
    public void sayfada_agile_swift_cargo_logosunu_dogrular() {
       home.anasayfaLogo.isDisplayed();
    }

    @Then("kullanici Login butonuna tiklar")
    public void kullanici_login_butonuna_tiklar() {
        home.loginButton.click();
    }

    @Then("email ve password kutularini dogrular")
    public void email_ve_password_kutularini_dogrular() {
       home.loginPageEmailBox.isDisplayed();
       home.loginPagePasswordBox.isDisplayed();
    }

    @Then("email olarak {string} girer")
    public void email_olarak_girer(String email) {
        home.loginPageEmailBox.sendKeys(ConfigReader.getProperty(email));
    }



    @Then("password olarak {string} girer")
    public void password_olarak_girer(String sifre) {
        home.loginPagePasswordBox.sendKeys(ConfigReader.getProperty(sifre));
    }



    @Then("singIn butonuna basar")
    public void sing_in_butonuna_basar() {
         home.loginPageSignIn.click();
    }



    @Then("basarili giris yapilabildigini test eder")
    public void basarili_giris_yapilabildigini_test_eder() {
        admin.AdminDashboardPageText.isDisplayed();
    }
}
