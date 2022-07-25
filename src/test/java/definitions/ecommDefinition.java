package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.loginPage;
import pageObject.registerPage;

import java.io.IOException;

import static support.util.getEvidences;

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
    public void ingresoElCorreo(String email) throws IOException {
        login.fillEmail(email);
        getEvidences();
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
    public void quieroRecibirOfertas(String offers) throws IOException {
        register.receiveOffers(offers);
        getEvidences();
    }


    @And("ingreso el nombre para la direccion {string}")
    public void ingresoElNombreParaLaDireccion(String name) {
        register.fillAddressFirstName(name);
    }

    @And("ingreso el apellido para la direccion {string}")
    public void ingresoElApellidoParaLaDireccion(String last) {
        register.fillAddressLastName(last);
    }

    @And("ingreso la compania {string}")
    public void ingresoLaCompania(String company) {
        register.fillCompany(company);
    }

    @And("ingreso la direccion {string}")
    public void ingresoLaDireccion(String address) {
        register.fillAddressOne(address);
    }

    @And("ingreso la segunda direccion {string}")
    public void ingresoLaSegundaDireccion(String address2) {
        register.fillAddressOne(address2);
    }

    @And("ingreso la ciudad {string}")
    public void ingresoLaCiudad(String city) {
        register.fillCity(city);
    }

    @And("selecciono el estado de {string}")
    public void seleccionoElEstadoDe(String state) {
        register.selectState(state);
    }

    @And("ingreso el codigo postal {string}")
    public void ingresoElCodigoPostal(String postal) {
        register.fillPostalCode(postal);
    }

    @And("selecciono el pais {string}")
    public void seleccionoElPais(String country) {
        register.selectCountry(country);
    }

    @And("ingreso informacion adicional {string}")
    public void ingresoInformacionAdicional(String info) {
        register.fillAdditionalInfo(info);
    }

    @And("ingreso el numero de casa {string}")
    public void ingresoElNumeroDeCasa(String phone) {
        register.fillPhoneNumber(phone);
    }

    @And("ingreso numero de celular {string}")
    public void ingresoNumeroDeCelular(String mobile) {
        register.fillMobilePhone(mobile);
    }

    @And("ingreso el alias {string} para la direccion")
    public void ingresoElAliasParaLaDireccion(String alias) throws IOException{
        register.fillAddressAlias(alias);
        getEvidences();
    }

    @Then("realizo el registro")
    public void realizoElRegistro() {
        register.clickRegister();
    }

    @Then("valido si email ya esta registrado")
    public void validoSiEmailYaEstaRegistrado() {
        login.validateEmailRegistered();
    }
}
