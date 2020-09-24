@urunarama
Feature: Amazon.com arama

  Background: Oncesinde calisacak method (BeforeMethod gibi)
    Given kullanici amazon sayfasina gider


  @amazon
  Scenario: TC02_kullanici amazonda headphones arar
    And kullanici arama kutusuna headphones yazar ve arar
    Then kullanici sonuc sayisini ekrana yazdirir

  @amazoncamera
  Scenario: TC03_kullanici amazonda arama yapar
    And kullanici arama kutusuna camera yazar ve arar
    Then kullanici sonuc sayisini ekrana yazdirir

