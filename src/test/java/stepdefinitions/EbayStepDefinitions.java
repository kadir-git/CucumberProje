package stepdefinitions;

import io.cucumber.java.an.E;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.EbayPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class EbayStepDefinitions {

    EbayPage ebayPage = new EbayPage();

    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String string) {  //string = https://www.ebay.com/
        Driver.getDriver().get(string);
    }
    @Given("kullanici ebay arama kutusuna {string} yazar ve arar")
    public void kullanici_ebay_arama_kutusuna_yazar_ve_arar(String string) {
        ebayPage.ebaySearchBox.sendKeys(string + Keys.ENTER);
    }

    @Then("kullanici ebayda sonuc sayisini ekrana yazdirir")
    public void kullanici_ebayda_sonuc_sayisini_ekrana_yazdirir() {

        System.out.println(ebayPage.ergebniss.getText());
    }

}
