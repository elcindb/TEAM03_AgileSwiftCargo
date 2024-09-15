Feature: US031 Admin Login Testi

  Scenario:TC01 Admin panel links visibility test

    Given kullanici "asUrl" anasayfaya gider
    When sayfada AgileSwift Cargo logosunu dogrular
    Then kullanici Login butonuna tiklar
    Then email ve password kutularini dogrular
    And email olarak "adminSelahattinEmail" girer
    And password olarak "password" girer
    Then singIn butonuna basar
    And basarili giris yapilabildigini test eder








