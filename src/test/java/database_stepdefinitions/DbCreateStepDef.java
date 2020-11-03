package database_stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.DBUtils;

import java.sql.SQLException;

public class DbCreateStepDef {

    @Given("kullanici yeni bir hotel olusturur")
    public void kullanici_yeni_bir_hotel_olusturur() throws SQLException {
        String query = "INSERT INTO dbo.tHOTEL (Code, Name, Address, Phone, Email, IDGroup, CreateDate, CreateUser) " +
                "VALUES ('113', 'BATCH 5', 'Cikmaz SK.', '10012', 'batch5@gmail.com', 10012, '2020-11-03 00:00:00.000', 4)";
        DBUtils.executeQuery(query);

        //son eklenen satirin name'ini ekrana yazdirin

        //System.out.println(DBUtils.getResultset().getString(query));

        //String query2 = "SELECT Name FROM dbo.tHOTEL";
        //DBUtils.executeQuery(query2);

        //DBUtils.getResultset().last();
        //System.out.println(DBUtils.getResultset().getObject(query2).toString());

    }



}
