package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.E;
import io.cucumber.java.es.Y;
import pageObject.loginPage;
import pageObject.registerPage;

public class ecommDefinition {
    /*VARIABLES*/
    loginPage login;
    registerPage register;

    public ecommDefinition() {
        login = new loginPage();
        register = new registerPage();
    }

    @Given("que la web esta operativa")
    public void queLaWebEstaOperativa() {
        hooks.driver.get("http://automationpractice.com/index.php");
    }

    @When("ingreso al servicio de registro")
    public void ingresoAlServicioDeRegistro() {
        login.clickLogin();
    }

    @And("ingreso el correo {string}")
    public void ingresoElCorreo(String email) {
        login.fillEmail(email);
        login.clickCreate();
    }

    @And("registro mis datos")
    public void registroMisDatos() {
    }


    @And("selecciono el genero {string}")
    public void seleccionoElGenero(String gender) {
        register.selectGender(gender);
    }

    @And("ingreso el nombre {string}")
    public void ingresoElNombre(String name) {
        register.fillFirstName(name);
    }

    @And("ingreso el apellido {string}")
    public void ingresoElApellido(String last) {
        register.fillLastName(last);
    }
    @And("valido el correo {string}")
    public void validoElCorreo(String email) {
        register.validateEmail(email);
    }
    @And("ingreso la contrasena {string}")
    public void ingresoLaContrasena(String passwd) {
        register.fillPassword(passwd);
    }

    @And("selecciono el dia de nacimiento {string}")
    public void seleccionoElDiaDeNacimiento(String day) {
        register.selectBirthDay(day);
    }

    @And("selecciono el mes de nacimiento {string}")
    public void seleccionoElMesDeNacimiento(String month) {
        register.selectBirthMonth(month);
    }

    @And("selecciono el ano de nacimiento {string}")
    public void seleccionoElAnoDeNacimiento(String year) {
        register.selectBirthYear(year);
    }

    @And("{string} quiero suscribirme al boletin")
    public void quieroSuscribirmeAlBoletin(String news) {
        register.signUpNewsletter(news);
    }

    @And("{string} quiero recibir ofertas")
    public void quieroRecibirOfertas(String offers) {
        register.receiveOffers(offers);
    }


}
