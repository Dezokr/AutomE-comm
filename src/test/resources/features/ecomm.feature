#language:en

  Feature: : Funcionalidad de registro
    Scenario: : Registro de usuario
      Given que la web esta operativa
      When ingreso al servicio de registro
      And ingreso el correo "dezokr1@gmail.com"
      And registro mis datos


