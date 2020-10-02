package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.WalmartPAge;


public class WalmartStepDefinitions {

    WalmartPAge walmartPAge = new WalmartPAge();

    @Given("kullanici walmart arama kutusuna {string} yazar ve arar")
    public void kullanici_walmart_arama_kutusuna_yazar_ve_arar(String string) {
        walmartPAge.walmartSearchBox.sendKeys(string + Keys.ENTER);
    }

    @Then("kullanici walmartta sonuc sayisini ekrana yazdirir")
    public void kullanici_walmartta_sonuc_sayisini_ekrana_yazdirir() {
        System.out.println(walmartPAge.walmartSonucSayisi.getText());
    }



}
