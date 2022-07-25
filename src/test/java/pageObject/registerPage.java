package pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import support.util;

import javax.xml.xpath.XPath;

public class registerPage extends util {
    //PERSONAL INFORMATION
    @FindBy(xpath = "//input[@id='id_gender1']") protected WebElement genderMr;
    @FindBy(xpath = "//input[@id='id_gender2']") protected WebElement genderMrs;
    @FindBy(xpath = "//input[@name='customer_firstname']") protected  WebElement firstName;
    @FindBy(xpath = "//input[@name='customer_lastname']") protected  WebElement lastName;
    @FindBy(xpath = "//input[@data-validate='isEmail']") protected WebElement isEmail;
    @FindBy(xpath = "//input[@name='passwd']") protected WebElement password;
    @FindBy(xpath = "//select[@name='days']") protected WebElement birthDay;
    @FindBy(xpath = "//select[@name='months']") protected WebElement birthMonth;
    @FindBy(xpath = "//select[@name='years']") protected WebElement birthYear;
    @FindBy(xpath = "//input[@name='newsletter']") protected WebElement newsletter;
    @FindBy(xpath = "//input[@name='optin']") protected WebElement specialOffers;

    //ADDRESS
    @FindBy(xpath = "//input[@name='firstname']") protected WebElement addressFirstName;
    @FindBy(xpath = "//input[@name='lastname']") protected WebElement addressLastName;
    @FindBy(xpath = "//input[@name='company']") protected WebElement company;
    @FindBy(xpath = "//input[@name='address1']") protected WebElement addressOne;
    @FindBy(xpath = "//input[@name='address2']") protected WebElement addressTwo;
    @FindBy(xpath = "//input[@name='city']") protected WebElement city;
    @FindBy(xpath = "//select[@name='id_state']") protected WebElement state;
    @FindBy(xpath = "//input[@name='postcode']") protected WebElement postcode;
    @FindBy(xpath = "//select[@name='id_country']") protected WebElement country;
    @FindBy(xpath = "//textarea[@name='other']") protected WebElement additionalInfo;
    @FindBy(xpath = "//input[@name='phone']") protected WebElement phone;
    @FindBy(xpath = "//input[@name='phone_mobile']") protected WebElement phoneMobile;
    @FindBy(xpath = "//input[@name='alias']") protected WebElement addressAlias;
    @FindBy(xpath = "//button[@name='submitAccount']") protected WebElement buttonRegister;



    public registerPage() {
        PageFactory.initElements(driver,this);
    }

    public void selectGender(String gender){
        wait30.until(ExpectedConditions.visibilityOf(genderMr));
        if (gender.equals("hombre")){
            genderMr.click();
        } else if(gender.equals("mujer")){
            genderMrs.click();}
        else {
            System.out.println("Ingrese solo hombre o mujer");
            }
    }

    public void fillFirstName(String name){//required
        wait30.until(ExpectedConditions.visibilityOf(firstName)).sendKeys(name);
    }
    public void fillLastName(String last){//required
        wait30.until(ExpectedConditions.visibilityOf(lastName)).sendKeys(last);
    }
    public void validateEmail(String email){//required
        String validate = isEmail.getAttribute("value");
        Assert.assertEquals(email, validate);
    }
    public void fillPassword(String passwd){//required 5caracMin
        wait30.until(ExpectedConditions.visibilityOf(password)).sendKeys(passwd);
    }
    public void selectBirthDay(String day){
        new Select(birthDay).selectByValue(day);
    }
    public void selectBirthMonth(String month){
        new Select(birthMonth).selectByValue(month);
    }
    public void selectBirthYear(String year){
        new Select(birthYear).selectByValue(year);
    }

    public void signUpNewsletter(String news){
        if (news.equalsIgnoreCase("si")){
            newsletter.click();
        } else if (news.equalsIgnoreCase("no")){
            Assert.assertFalse(newsletter.isSelected());
        } else{
            System.out.println("Ingrese solo si o no");
        }
    }

    public void receiveOffers(String offers){
        if (offers.equalsIgnoreCase("si")){
            specialOffers.click();
        } else if (offers.equalsIgnoreCase("no")){
            Assert.assertFalse(specialOffers.isSelected());
        } else{
            System.out.println("Ingrese solo si o no");
        }
    }

    //ADDRESS

    public void fillAddressFirstName(String addressFName){//required
        wait30.until(ExpectedConditions.elementToBeClickable(addressFirstName)).sendKeys(addressFName);
    }
    public void fillAddressLastName(String addressLName){//required
        wait30.until(ExpectedConditions.elementToBeClickable(addressLastName)).sendKeys(addressLName);
    }
    public void fillCompany(String companyA){
        wait30.until(ExpectedConditions.elementToBeClickable(company)).sendKeys(companyA);
    }
    public void fillAddressOne(String addressO){//required
        wait30.until(ExpectedConditions.elementToBeClickable(addressOne)).sendKeys(addressO);
    }
    public void fillAddressTwo(String addressT){
        wait30.until(ExpectedConditions.elementToBeClickable(addressTwo)).sendKeys(addressT);
    }
    public void fillCity(String cityS){//required
        wait30.until(ExpectedConditions.elementToBeClickable(city)).sendKeys(cityS);
    }
    public void selectState(String stateS){//required
        new Select(state).selectByVisibleText(stateS);
    }
    public void fillPostalCode(String postalC){//required
        wait30.until(ExpectedConditions.elementToBeClickable(postcode)).sendKeys(postalC);
    }
    public void selectCountry(String countryS){//required
        new Select(country).selectByVisibleText(countryS);
    }
    public void fillAdditionalInfo(String info){
        wait30.until(ExpectedConditions.elementToBeClickable(additionalInfo)).sendKeys(info);
    }
    public void fillPhoneNumber(String phoneS){//required
        wait30.until(ExpectedConditions.elementToBeClickable(phone)).sendKeys(phoneS);
    }
    public void fillMobilePhone(String mobileS){//required
        wait30.until(ExpectedConditions.elementToBeClickable(phoneMobile)).sendKeys(mobileS);
    }

    public void fillAddressAlias(String aliasS){//required
        wait30.until(ExpectedConditions.elementToBeClickable(addressAlias)).sendKeys(aliasS);
    }

    //REGISTER
    public void clickRegister(){
        wait30.until(ExpectedConditions.elementToBeClickable(buttonRegister)).click();
    }



}
