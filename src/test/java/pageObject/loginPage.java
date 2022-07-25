package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class loginPage extends util {
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    protected WebElement btn_login;
    @FindBy(xpath = "//input[@name='email_create']")
    protected WebElement tbx_email;
    @FindBy(xpath = "//button[@name='SubmitCreate']")
    protected WebElement btn_create;
    @FindBy(xpath = "//h4[text()='Resource Limit Is Reached'") protected WebElement limit;
    @FindBy(xpath = "//div[@id='create_account_error']") protected WebElement emailRegistered;

    public loginPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickLogin() {
        wait30.until(ExpectedConditions.visibilityOf(btn_login)).click();
    }

    public void fillEmail(String email) {
        wait30.until(ExpectedConditions.visibilityOf(tbx_email)).sendKeys(email);
    }

    public void clickCreate() {
        wait30.until(ExpectedConditions.elementToBeClickable(btn_create)).click();
    }
    public void validateEmailRegistered(){
        boolean existe = emailRegistered.isDisplayed();

        if(existe){
            System.out.println("Correo no registrado");
        } else {
            System.out.println("El correo ya ha sido registrado");
        }

    }

}
