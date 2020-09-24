package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    //TestNG'deki @BeforeMethod gibi calisir
    //Her senaryodan önce calisir.
    @Before
    public void setUp(){
        System.out.println("setUp calisti.");
    }


    //TestNG'deki @AfterMethod gibi calisir
    //Her senaryodan sonra calisir.
    @After
    public void tearDown(Scenario scenario){
        System.out.println("tearDown calisti.");

        //Ekran görüntüsü almak icin bu sabit code kullanilir.
        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

        //Eger senaryonun sonucu failed ise(basarisizsa) ekran görüntüsü rapora eklenebilir.
        if(scenario.isFailed()){
            scenario.embed(screenshot , "image/png");
        }

    }






}
