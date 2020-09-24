package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.AmazonPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("amazon_link"));
    }

    @Given("kullanici arama kutusuna headphones yazar ve arar")
    public void kullanici_arama_kutusuna_headphones_yazar_ve_arar() {
        amazonPage.searchBox.sendKeys(ConfigurationReader.getProperty("amazon_word") + Keys.ENTER);
    }

    @Then("kullanici sonuc sayisini ekrana yazdirir")
    public void kullanici_sonuc_sayisini_ekrana_yazdirir() {
        System.out.println(amazonPage.ergebnisse.getText());
    }

    @Given("kullanici arama kutusuna camera yazar ve arar")
    public void kullanici_arama_kutusuna_camera_yazar_ve_arar() {
        amazonPage.searchBox.sendKeys("camera" + Keys.ENTER);
    }

    @Given("kullanici arama kutusuna {string} yazar ve arar")
    public void kullanici_arama_kutusuna_yazar_ve_arar(String string) {
        amazonPage.searchBox.sendKeys(string + Keys.ENTER);
    }

    @Given("kullanici dropdownda {string} secer")
    public void kullanici_dropdownda_secer(String string) {
        Select select = new Select(amazonPage.dropDown);
        select.selectByVisibleText(string);
    }

}
