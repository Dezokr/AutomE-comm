package definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.E;
import io.cucumber.java.es.Y;
import pageObject.loginPage;

public class ecommDefinition {
    /*VARIABLES*/
    loginPage login;

    public ecommDefinition() {
        login = new loginPage();
    }

    @Dado("que la web esta operativa")
    public void queLaWebEstaOperativa() {
        hooks.driver.get("http://automationpractice.com/index.php");
    }

    @Cuando("ingreso al servicio de registro")
    public void ingresoAlServicioDeRegistro() {
        login.clickLogin();
    }

    @E("ingreso el correo {string}")
    public void ingresoElCorreo(String email) {
        login.fillEmail(email);
        login.clickCreate();
    }

    @Y("registro mis datos")
    public void registroMisDatos() {
    }


}
