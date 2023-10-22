package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tesdata.logindata;

public class loginPage extends BasePage{
    private final logindata loginData;
    public loginPage(WebDriver driver){
        super(driver);
        loginData=new logindata();
    }
    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement usernameField;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;
    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement loginButton;
    @FindBy(xpath = "//div[@class='login_logo']")
    private WebElement textswablab;
    @FindBy(xpath = "//span[@class='title']")
    private WebElement textproducts;
    @FindBy(xpath = "//h3[.='Epic sadface: Username and password do not match any user in this service']")
    private WebElement textErrorLogin;
    public boolean isDisplayed(){
        return isElementDisplayed(textswablab);
    }
    public boolean isDisplayed2(){
        return isElementDisplayed(textproducts);
    }
    public boolean isDisplayedError(){
        return isElementDisplayed(textErrorLogin);
    }

    public void clickLogin(){
        clickElement(loginButton);
    }
    public void fillIUsername(){
        setTextElement(usernameField,loginData.getInputInvalidUsername());
    }
    public void fillVUsername(){
        setTextElement(usernameField,loginData.getInputValidUsername());
    }
    public void fillVPassword(){
        setTextElement(passwordField,loginData.getInputValidPassword());
    }
    public void fillIPassword(){
        setTextElement(passwordField,loginData.getInputInvalidPassword());
    }
    public void loginExistingAccount() {
        setTextElement(usernameField, loginData.getInputValidUsername());
        setTextElement(passwordField, loginData.getInputValidPassword());
        clickElement(loginButton);
    }
}

