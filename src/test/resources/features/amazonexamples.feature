@birdenfazlaexample @amazon
  Feature: Amazonda Urun Arama
    Scenario Outline: TC07_kullanici amazonda dropdown ve arama kutusu kullanarak arama yapar
      Given kullanici "http://amazon.com" sayfasina gider
      And kullanici dropdownda "<kategori>" secer
      And kullanici arama kutusuna "<urunismi>" yazar ve arar
      Then kullanici sonuc sayisini ekrana yazdirir

      Examples:
      | kategori | urunismi |
      |Automobil|phone holder|
      |Baby      |stroller  |
      |Bücher     |Miserables|




      