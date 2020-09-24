  Feature: Ebay.com arama
    @ebayarama
    Scenario Outline: TC06_kullanici ebayda urun arar
      Given kullanici "https://www.ebay.com/" sayfasina gider
      And kullanici ebay arama kutusuna "<urun>" yazar ve arar
      Then kullanici ebayda sonuc sayisini ekrana yazdirir

      Examples: Urun Listesi
      |urun|
      |araba  |
      |bebek arabasi|
      |bisiklet     |