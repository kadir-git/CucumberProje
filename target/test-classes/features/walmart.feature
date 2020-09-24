@walmart
Feature: Walmart Urun Arama
    Scenario Outline: TC08_kullanici walmartta urun aramasi yapar
    Given kullanici "https://walmart.com" sayfasina gider
    And kullanici walmart arama kutusuna "<kelime>" yazar ve arar
    Then kullanici walmartta sonuc sayisini ekrana yazdirir

        Examples: Test Verileri
      | kelime |
    |calculator      |
    |watch           |
    |flower          |


