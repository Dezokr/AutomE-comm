#language:en

  Feature: : Funcionalidad de registro
    Scenario Outline: Registro de usuario
      Given que la web esta operativa
      When ingreso al servicio de registro
      And ingreso el correo "<email>"
      And selecciono el genero "<gender>"
      And ingreso el nombre "<name>"
      And ingreso el apellido "<last>"
      And valido el correo "<email>"
      And ingreso la contrasena "<passwd>"
      And selecciono el dia de nacimiento "<day>"
      And selecciono el mes de nacimiento "<month>"
      And selecciono el ano de nacimiento "<year>"
      And "<news>" quiero suscribirme al boletin
      And "<offers>" quiero recibir ofertas
      Examples:
        | email             | gender | name  | last  | passwd | day | month | year | news | offers |
        | dezokr1@gmail.com | hombre | Mario | Rojas | xxx22  | 5   | 12    | 2010 | si   | no     |



