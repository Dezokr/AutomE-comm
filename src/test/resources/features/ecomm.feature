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
      And ingreso el nombre para la direccion "<name>"
      And ingreso el apellido para la direccion "<last>"
      And ingreso la compania "<company>"
      And ingreso la direccion "<address>"
      And ingreso la segunda direccion "<address2>"
      And ingreso la ciudad "<city>"
      And selecciono el estado de "<state>"
      And ingreso el codigo postal "<postal>"
      And selecciono el pais "<country>"
      And ingreso informacion adicional "<info>"
      And ingreso el numero de casa "<phone>"
      And ingreso numero de celular "<mobile>"
      And ingreso el alias "<alias>" para la direccion
      And ingreso el alias "<numero>" para llamar
      Then realizo el registro
      Examples:
        | email             | gender | name  | last  | passwd | day | month | year | news | offers | company | address            | address2 | city    | state      | postal | country       | info             | phone     | mobile | alias |
        | dezokr1@gmail.com | hombre | Mario | Rojas | xxx22  | 5   | 12    | 2010 | si   | no     | UNICA   | Blv. 254 Street #4 |          | Angeles | California | 00000  | United States | nada que agregar | 991456789 |        | casa  |

    Scenario: Registro de usuario con correo registrado
      Given que la web esta operativa
      When ingreso al servicio de registro
      And ingreso el correo "dezokr2@gmail.com"
      Then valido si email ya esta registrado
